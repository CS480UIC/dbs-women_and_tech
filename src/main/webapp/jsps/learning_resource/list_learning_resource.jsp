<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> Learning Resource Table </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>Resource ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Title</th>
		<th>Type</th>
		<th>Member Education Level</th>
	
	
	</tr>
<c:forEach items="${learning_resource_list}" var="line">
	<tr>
		<td>${line.resourceID}</td>

		<td>${line.resourceTitle}</td>
		<td>${line.resourceType}</td>
		<td>${line.author}</td>
		<td>${line.publisher}</td>
		<td>${line.language}</td>

	
	</tr>
</c:forEach>
</table>
</body>
</html>

