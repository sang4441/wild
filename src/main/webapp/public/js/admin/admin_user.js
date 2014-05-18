function User($scope, $http) {
    $http.get('/ANBD/json/user').
        success(function(data) {
            $scope.users = data;
        });
}