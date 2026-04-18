<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="Ex5Servlet" method="post">
			<label for="login">Login</label>
			<input type="text" name="login" id="login"><br>
			<label for="password">Password</label>
			<input type="password" name="password" id="password"><br>
			
			<input type="submit" value="Ok">
			<input type="reset" value="Annuller">
			
		</form>
</body>
</html>