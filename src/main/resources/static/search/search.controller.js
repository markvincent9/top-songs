/**
 * Created by markvincent9 on 4/18/17.
 */

(function () {
    'use strict';
    
    angular.module('search.controller', []);
    
    angular.module('search.controller')
            .controller('SearchController', SearchController);
    
    SearchController.$inject = ['SearchResource'];
    
    function SearchController(SearchResource) {
        var vm = this;
        vm.query = '';
        vm.result = {};
        vm.totalItems = 0;
        vm.currentPage = 1;
        
        function search () {
            var start = 1;
            
            if(vm.currentPage !== 1) {
                start = ((vm.currentPage * 10) - 10) + 1;
            }
            
            if(vm.query) {
                SearchResource.search(vm.query, start)
                .then(function (res) {
                    vm.result = fixObject(res.data);
                    if(vm.result){
                        if(!angular.isArray(vm.result.response.result)) {
                            vm.result.response.result = [vm.result.response.result];
                        }
                        vm.totalItems = vm.result.response.total;
                        truncateFacet();
                    }
                });
            }
            
        }
        
        function truncateFacet () {
            var showFacet = 10;
            vm.result.response.facet.forEach(function (facet) {
                angular.extend(facet, {show: showFacet});
            });
        }
        
       vm.showMoreFacet = function (facet) {
            facet.show += 10;
        };
        
        vm.search = function () {
            search();
        };
        
        vm.toggleFacet = function (facet, facetValue) {
            var newQuery = " AND " + facet.name + ":\"" + facetValue + "\"";
            vm.currentPage = 1;
            vm.query = vm.query + newQuery;
            search();
        };
        
        function fixObject(obj) {
            var str = JSON.stringify(obj);
            str = str.replace(/search:/g, '');
            str = str.replace(/ts:/g, '');
            obj = JSON.parse(str);
            return obj;
        }
        
        vm.isArray = angular.isArray;
    }
    
})();