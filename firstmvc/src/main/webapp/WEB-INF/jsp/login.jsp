<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="login-panel">
<div>
<h1 align="center">Login Here..</h1>
<div align="center">
<input type="text" name="userName" class="txt"/> <br/>
<input type="password" name="userPasswd" class="txt"/><br/>
<input type="submit" value="login"/>
</div>
</div>
</form>
<h2> ${msg} </h2>
</body>
</html>