<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/loginaction.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Spring Boot</title>
</head>

 <body>
<div class="container">
<div class="header"></div>
</div>
<div class="gridinterno">
<form id="form_id" method="post" name="myform" action="/login">
<div class="Usernametext">Username</div>
<div class="inputuser">
<input type="text" name="username" id="username"></div>
<div class="passwordtext">Password</div>
<div class="inputpassword">
<input type="password" name="password" id="password"></div>
<div class="accepttext">Entra</div>
<div class="inputbutton">
<input type="submit" value="" id="submit" ></div>
<a class="reg"  href="Evento1" >Non sei ancora iscritto?Registrati!</a>
</form>
</div>
</body>
</html>
 