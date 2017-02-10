app.controller('companiesController', function ($scope, Restangular) {
    $scope.headingTitle = "Companies";
    Restangular.all('companies').getList().then(function (companiesList) {
        $scope.companies = companiesList;
    });



});

app.controller('documentsController', function ($scope) {
    $scope.headingTitle = "Documents";
});