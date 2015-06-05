var app = angular.module('myApp', []);

function MyController($scope, $http) {
	$scope.submitTemperature = function() {
		$http.post('median/temperature/', $scope.temperature).success(
				function(data) {
					$scope.temperature.median = data;
				});
	};

};