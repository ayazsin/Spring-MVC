
<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="titre.hello"/> : ${firstname} ${lastname} </title>
</head>
<body>
<h2>Hello 3 ${firstname} ${lastname} </h2>
<spring:message code="libelle.hello.mess" arguments="${firstname}"/>
</body>
</html>