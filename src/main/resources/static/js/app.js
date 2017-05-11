(function () {
  'use strict';

    angular.module('topsongs', [
        'search.resource',
        'search.controller',
        'ui.router',
        'ui.bootstrap'
    ]).config(Config);

    Config.$inject = ['$stateProvider',
        '$urlRouterProvider', '$locationProvider'];

    function Config ($stateProvider,
                     $urlRouterProvider,
                     $locationProvider) {

        $urlRouterProvider.otherwise('/');
        $locationProvider.html5Mode({
            enabled: true,
            requireBase: false
        });

        $stateProvider
            .state('search', {
                url: '/',
                templateUrl: 'search/search.html',
                controller: 'SearchController',
                controllerAs: 'vm'
            })

    }

})();