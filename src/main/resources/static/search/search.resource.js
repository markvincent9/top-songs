(function () {
  'use strict';

  angular.module('search.resource',[]);

  angular.module('search.resource')
      .factory('SearchResource', SearchResource);

  SearchResource.$inject = ['$http'];

  function SearchResource ($http) {
    return {
        search: function (query, start) {
            return $http({
                method: 'GET',
                url: '/songs',
                params: {
                    q: query,
                    start: start
                }
            })
        }
    }
  }
})();