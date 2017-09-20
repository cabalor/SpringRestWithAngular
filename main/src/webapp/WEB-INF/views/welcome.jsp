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
<title>hello</title>
</head>
<body ng-controller="bookController as bCont">
<p>hello</p>
<h1>{{2+5}} = powinno wyjsc 7</h1>
<ul>
          <li ng-repeat ="bk in bCont.books">
          tytul {{bk.title}} autor {{bk.author}} </li>
          </ul>
</body>
</html>