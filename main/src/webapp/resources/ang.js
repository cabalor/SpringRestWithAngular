var apka = angular.module('test', ['ngResource']);


apka.controller("bookController", function($resource){
    var appi = this;
    var Books = $resource('books/:bookId')
    appi.book = new Books();
    function getData(){
        appi.books = Books.query(function success(data){
        	console.log("podabrano "+ data)
        });
    	
    	/*$http({
            method : 'GET',
            url : 'books'
        }).then(function success(response){
            appi.books = response.data;
            console.log(appi.books)
        }, function error(response){
            console.log('error '+response.status)
        });*/
    }
  
    
    appi.addBook = function(book){
    	appi.book.$save(function(data){
    		getData();
    		appi.book = new Books();
    	})
    	/*$http({
    	 method : 'POST',
         url : 'books',
         data: book
    }).then(function success(response){
    	getData();
    	appi.book={}
    }, function error(response){
        console.log('buba '+ book);
    });*/
    }
    
    appi.load = function(id){
    	appi.det = Books.get({bookId: id});
    	
    }
    
        
    getData();
});