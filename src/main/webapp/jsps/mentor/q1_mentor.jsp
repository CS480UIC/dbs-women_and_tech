<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> mentor Table </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>Member ID</th>
		<th>Years in Industry</th>
		<th>Role in Industry</th>
		<th>Years of Mentoring</th>

	</tr>
<c:forEach items="${MentorList}" var="mentor">
	<tr>
		<td>${mentor.member_id}</td>
		<td>${mentor.years_in_industry}</td>
		<td>${mentor.role_in_industry}</td>
		<td>${mentor.years_of_mentoring}</td>

	</tr>
</c:forEach>
</table>
</body>
</html>
