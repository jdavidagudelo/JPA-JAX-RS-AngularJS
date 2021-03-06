var createApp = angular.module('createApp', ['createServices']);

createApp.controller('createController', ['$scope', 'SampleById', 'CreateSample', function($scope, SampleById, CreateSample) {
	var id = window.location.search.split("=")[1];
	  $scope.sample = SampleById.get({id:id}, function() {
		});
	  $scope.submit = function(){
		  CreateSample.save({id: parseInt($scope.sample.id), text: $scope.sample.text});
		  window.location.href = "http://localhost:8080/SimpleProject/index.html";
	  };
	}]);
