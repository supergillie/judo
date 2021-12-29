angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://budonord.herokuapp.com/strat', { mode: 'no-cors'}).
        then(function(response) {
            $scope.greeting = 'response.data';
        });
});