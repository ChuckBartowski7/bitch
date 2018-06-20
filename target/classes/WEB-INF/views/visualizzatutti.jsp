
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/eventikid.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Spring Boot</title>
</head>

 <body>
 <h1>Benvenuto Admin!</h1>
 <a href="/tornaIndietro">Torna Indietro!</a>
 
 <ul>
<c:forEach var="product" items="${utenti}">
<li>${product.username}</li>
</c:forEach>
</ul>
</body>