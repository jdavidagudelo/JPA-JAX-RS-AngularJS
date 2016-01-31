var createServices = angular.module('createServices', ['ngResource']);


createServices.factory('SampleById', ['$resource',
                                  function($resource){
                                    return $resource('http://localhost:8080/SimpleProject/rest/SampleRest/getById/:id', {id: "@id"});
                                    }]);
createServices.factory('CreateSample', ['$resource',
                                      function($resource){
                                        return $resource('http://localhost:8080/SimpleProject/rest/SampleRest/insert');
                                        }]);