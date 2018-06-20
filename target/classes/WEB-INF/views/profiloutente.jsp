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

<h1>Page Utente</h1>
${nome}
Benvenuto Utente 
<h1>${pageContext.request.userPrincipal.name}</h1>
<h1>${prova}</h1>
</body>
</html>
 