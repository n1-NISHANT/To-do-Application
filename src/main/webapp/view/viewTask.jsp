<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TO DO</title>
</head>
<body>
	<div align = "center">
	<h1 align="center">To-DO Details..</h1>
	<table border = "1">
		<thead>
				<tr>
				<td>Task No.</td>
				<td>TaskName</td>
				<td>Date</td>
				<td>Time</td>
				</tr>
		</thead>
		<tbody>
			<c:forEach items="${user}" var="us" varStatus="index">
					<tr>
						<td>${index.count}</td>
						<td>${us.taskName}</td>
						<td>${us.date}</td>
						<td>${us.time}</td>
					</tr>		
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>