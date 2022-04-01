<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> User Table </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>Member ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Birthday</th>
		<th>Education Level</th>
		<th>Email</th>
		<th>Bio</th>
	</tr>
<c:forEach items="${UserList}" var="user">
	<tr>
		<td>${user.member_id}</td>
		<td>${user.first_name}</td>
		<td>${user.last_name}</td>
		<td>${user.birthday}</td>
		<td>${user.education_level}</td>
		<td>${user.email}</td>
		<td>${user.bio}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>
