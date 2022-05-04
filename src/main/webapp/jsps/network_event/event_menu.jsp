<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="">
		
		<title>Network Event Menu</title>
		
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">    
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<meta http-equiv="content-type" content="text/html;charset=utf-8">
		<!--
		<link rel="stylesheet" type="text/css" href="styles.css">
		-->
	
	</head>
	<body>
		
		<h1>Network Event Menu</h1>

		<a href="<c:url value='/jsps/network_event/event_create.jsp'/>" target="_parent">Create Network Event</a> |&nbsp; 
		<a href="<c:url value='/jsps/network_event/event_read.jsp'/>" target="_parent">Read Network Event</a> |&nbsp;
		<a href="<c:url value='/jsps/network_event/event_update.jsp'/>" target="_parent">Update Network Event</a> |&nbsp;	 
		<a href="<c:url value='/jsps/network_event/event_delete.jsp'/>" target="_parent">Delete Network Event</a> |&nbsp;
		<a href="<c:url value='/findARUser'/>" target="body">Network Event Table</a>
		<br>
		<br>
		<img src="https://www.marcom-connect.com/wp-content/uploads/2012/08/networking-event.jpg" width="1200" height="500">
	
	</body>
</html>