<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="">
		
		<title>Special Interest Group Menu</title>
		
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
		<h1>Special Interest Group  Menu</h1>
	    <br>
		<a href="<c:url value='/jsps/special_interest_group/special_interest_group_create.jsp'/>" target="_parent">Create Special Interest Group </a> |&nbsp; 
		<a href="<c:url value='/jsps/special_interest_group/special_interest_group_read.jsp'/>" target="_parent">Read Special Interest Group </a> |&nbsp;
		<a href="<c:url value='/jsps/special_interest_group/special_interest_group_update.jsp'/>" target="_parent">Update Special Interest Group </a> |&nbsp;	 
		<a href="<c:url value='/jsps/special_interest_group/special_interest_group_delete.jsp'/>" target="_parent">Delete Special Interest Group </a>	
	
	</body>
</html>