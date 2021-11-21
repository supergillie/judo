angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $https.get('https://budonord.herokuapp.com/strat').
        then(function(response) {
            $scope.greeting = response.data;
        });
});