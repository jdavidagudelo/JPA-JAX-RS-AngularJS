var sampleServices = angular.module('sampleServices', ['ngResource']);

sampleServices.factory('Sample', ['$resource',
  function($resource){
    return $resource('http://localhost:8080/SimpleProject/rest/SampleRest/getAll', {});
  }]);

