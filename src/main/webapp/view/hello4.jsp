
<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="titre.hello"/> </title>
</head>
<body>
<h2>Hello 4 ${first_name} ${last_name} </h2>
<spring:message code="libelle.hello.mess" arguments="${person.first_name} ${person.last_name}"/>
<br>
<spring:message code="libelle.hello.mess" arguments="${person2.first_name} ${person2.last_name}"/>
</body>
</html>