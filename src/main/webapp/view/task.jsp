<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>To Do</title>
</head>
<body>
	<div align="center">
		<h1 align="center">Create Task</h1>
		<form action="task" method="post">
			<table>
				<tr>
					<td>Task Name : </td>
					<td><input type="text" name="taskName"></td>
				</tr>
				<tr>
					<td>Date : </td>
					<td><input type="date" name="date"></td>
				</tr>
				<tr>
					<td>Time : </td>
					<td><input type="time" name="time"></td>
				</tr>
				<tr>
					<td>
					<input type="submit" value="Save" name="save">
					</td>
				</tr>
			</table>
		</form>
		<h2><font color="Green">${msg}</font></h2>
		<h2><a href="/viewTask">${viewtask}</a></h2>
	</div>
</body>
</html>