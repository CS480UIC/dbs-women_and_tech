<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> Scholarship (> $700) Table </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>Scholarship ID</th>
		<th>scholarship Name</th>
		<th>Scholarship Amount</th>
		<th>Scholarship Description</th>
		<th>Application Deadline</th>
		<th>Application Released</th>
		<th>Requirements</th>

	</tr>
	<c:forEach items="${ScholarshipList}" var="scholarship">
	<tr>
		<td>${scholarship.scholarship_id}</td>
		<td>${scholarship.scholarship_name}</td>
		<td>${scholarship.scholarship_amount}</td>
		<td>${scholarship.scholarship_description}</td>
		<td>${scholarship.application_deadline}</td>
		<td>${scholarship.application_released}</td>
		<td>${scholarship.requirements}</td>

	</tr>
</c:forEach>
</table>
</body>
</html>
