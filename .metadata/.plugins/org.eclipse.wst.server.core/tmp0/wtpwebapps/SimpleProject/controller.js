

var sampleApp = angular.module('sampleApp', ['sampleServices']);

sampleApp.controller('sampleController', ['$scope', 'Sample', function($scope, Sample) {
	  $scope.samples = Sample.get({}, function() {
		  $scope.samples = $scope.samples.SampleDto;
		});
	}]);
