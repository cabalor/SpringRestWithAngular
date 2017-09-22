<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="test">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<spring:url value="/resources/style.css" var="style" />
<link href="${style}" rel="stylesheet" />
<spring:url value="/resources/angular.js" var="angu" />
<script src="${angu}"></script>
<spring:url value="/resources/ang.js" var="script" />
<script src="${script}"></script>
<spring:url value="/resources/angular-resource.js" var="res" />
<script src="${res}"></script>
<title>hello</title>
</head>
<body ng-controller="bookController as bCont">
	<p>hello</p>
	<h1>{{2+5}} = powinno wyjsc 7</h1>
	<ul>
		<li ng-repeat="bk in bCont.books" ng-click="bCont.load(bk.id);">
			 tytul {{bk.title}} autor {{bk.author}}<button ng-click="bCont.del(bk.id)">del</button></li>
	</ul>



	<h1>you can add book here</h1>
	<form>
		<input type="text" ng-model="bCont.book.title" placeholder="title"><br>
		<input type="text" ng-model="bCont.book.author" placeholder="author"><br>
		<button ng-click="bCont.addBook(bCont.book)">add book</button>
	</form>

	<div ng-show="bCont.det">
		<h1>{{bCont.det.author}}</h1>
	</div>


</body>
</html>