app.controller('companiesController', function ($scope, Restangular) {
    $scope.headingTitle = "Companies";
    Restangular.all('companies').getList().then(function (companiesList) {
        $scope.companies = companiesList;
    });

});

app.controller('documentsController', function ($scope, Restangular) {
    $scope.headingTitle = "Documents";

    //Algunas opciones predeterminadas
    var paginationOptions = {
        pageNumber: 1,
        pageSize: 5,
        sort: null
    };

    //Apunta a la url /documents
    var documentsService = Restangular.all('documents');

    /* Se usa customGET porque hay que pasarle parametros
     * No se usa customGETLIST porque no devuelve una lista, sino un objeto unico (Page), con la lista de documentos adentro (y otros parametros, como totalElements)
     *
     * Se puede probar la llamada al servicio REST usando:
     *   http://localhost:9000/documents
     *   http://localhost:9000/documents?page=3&size=2
     */
    documentsService.customGET('', {page: paginationOptions.pageNumber, size: paginationOptions.pageSize} ).then(function (page) {
        /* EL objeto page representa la Page<Document> devuelta por el DocumentController#getAllPaginated
         * En page.content vienen los documentos
         * En page.totalElements viene el total de documentos (de todos)
         */
        $scope.gridOptions.data = page.content;
        $scope.gridOptions.totalItems = page.totalElements;
    });

    //Opciones para el componente grilla
    $scope.gridOptions = {
        paginationPageSizes: [5, 10, 20],
        paginationPageSize: paginationOptions.pageSize,
        enableColumnMenus:false,
        useExternalPagination: true,
        enableSorting: paginationOptions.sort,
        columnDefs: [
            { field: 'id' },
            { name: 'Payer', field: 'payer.razonSocial' },
            { name: 'Número legal', field: 'legalDocRef' },
            { name: 'Emisión', field: 'issueDate', cellFilter: 'date' },
            { name: 'Pago', field: 'dueAmount', cellFilter: 'currency'}
        ],
        //Se registra el evento onPaginationChanged para volver a consultar el servicio cuando cambia la pagina
        onRegisterApi: function(gridApi) {
            $scope.gridApi = gridApi;
            gridApi.pagination.on.paginationChanged(
                $scope,
                function (newPage, pageSize) {
                    paginationOptions.pageNumber = newPage;
                    paginationOptions.pageSize = pageSize;

                    documentsService.customGET('', {page: paginationOptions.pageNumber, size: paginationOptions.pageSize} ).then(function (page) {
                        $scope.gridOptions.data = page.content;
                        $scope.gridOptions.totalItems = page.totalElements;
                    });

                });
        }
    };


});