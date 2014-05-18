function Product($scope, $http) {
    $http.get('/ANBD/json/product').
        success(function(data) {
            $scope.items = data;
        });
}