<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> Academic and User Table </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>event_id</th>
		<th>member_id</th>
		<th>event_title</th>
		<th>event_address</th>
		<th>event_date</th>
	
	</tr>
<c:forEach items="${event_network_list}" var="line">
	<tr>
		<td>${line.event_id}</td>
		<td>${line.member_id}</td>
		<td>${line.event_title}</td>
		<td>${line.event_address}</td>
		<td>${line.event_date}</td>
	
	</tr>
</c:forEach>
</table>
</body>
</html>