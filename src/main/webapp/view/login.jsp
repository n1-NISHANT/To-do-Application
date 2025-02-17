<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>To-DO</title>
</head>
<body>
	<div align = "center">
		<h1>User Login</h1>
	   <form action="userLogin" method="POST">
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
	  <h2><font color="Green">${error}</font></h2>
  </div>
</body>
</html>