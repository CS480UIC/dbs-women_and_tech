<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> menteeCS Table </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>Member ID</th>
		<th>Field Of Interest</th>
		<th>Major</th>
		<th>School Name</th>

	</tr>
<c:forEach items="${MenteeList}" var="mentee">
	<tr>
		<td>${mentee.member_id}</td>
		<td>${mentee.field_of_interest}</td>
		<td>${mentee.major}</td>
		<td>${mentee.school_name}</td>

	</tr>
</c:forEach>
</table>
</body>
</html>
