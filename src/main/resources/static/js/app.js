var app = angular.module('billingApp', ['ngRoute', 'restangular']);

app.config(function ($routeProvider, RestangularProvider) {


    //RestangularProvider.setBaseUrl(location.protocol + '//' + location.hostname + (location.port && ':' + location.port) + location.pathname + 'rest');
    RestangularProvider.setBaseUrl('http://localhost:8080/');

    $routeProvider
        .when('/companies', {
            templateUrl: '/views/companies.html',
            controller: 'companiesController'
        })
        .when('/documents', {
            templateUrl: '/views/documents.html',
            controller: 'documentsController'
        })
        .otherwise(
            {redirectTo: '/'}
        );
});