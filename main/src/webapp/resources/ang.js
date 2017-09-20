var apka = angular.module('test', []);


apka.controller("bookController", function($http){
    var appi = this;
    function getData(){
        $http({
            method : 'GET',
            url : 'books'
        }).then(function success(response){
            appi.books = response.data;
            console.log(appi.books)
        }, function error(response){
            console.log('error '+response.status)
        });
    }
    getData();
});