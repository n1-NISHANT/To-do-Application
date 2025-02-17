<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<h1 align="center" >Registration Form</h1>
		<form action="userSignin" method ="POST">
	   <table>
	   		<tr>
	   			<td>Name : </td>
	   			<td><input type="text" name= "name"></td>
	   		</tr>
	   		<tr>
	   			<td>Email : </td>
	   			<td><input type="email" name= "email"></td>
	   		</tr>
	   		<tr>
	   			<td>Password : </td>
	   			<td><input type="password" name= "pwd"></td>
	   		</tr>
	   		<tr>
	   			<td>Gender : </td>
	   			<td><input type="radio" name= "gender" value="male">Male</td>
	   			<td><input type="radio" name= "gender" value="femali">Female</td>
	   		</tr>
	   		<tr>
	   			<td>Phone No. : </td>
	   			<td><input type="number" name= "phno"></td>
	   		</tr>
	   		<tr>
	   			<td><input type="submit" value="SignIn" name="signin"></td>
	   			<td><input type = "reset" value = "Reset"></td>
	   		</tr>
	   </table>
	</form><br>
	<h2><font color ='green'>${msg}</font></h2>
	<h3><a href ="/login">${login}</a></h3>
	</div>
</body>
</html>