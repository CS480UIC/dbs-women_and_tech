<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="">
		
		<title>Learning Resource Menu</title>
		
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
		
		<h1>Learning Resource Menu</h1>

		<a href="<c:url value='/jsps/learning_resource/resource_create.jsp'/>" target="_parent">Create Learning Resource</a> |&nbsp; 
		<a href="<c:url value='/jsps/learning_resource/resource_read.jsp'/>" target="_parent">Read Learning Resource</a> |&nbsp;
		<a href="<c:url value='/jsps/learning_resource/resource_update.jsp'/>" target="_parent">Update Learning Resource</a> |&nbsp;	 
		<a href="<c:url value='/jsps/learning_resource/resource_delete.jsp'/>" target="_parent">Delete Learning Resource</a> |&nbsp; 	
		
		<img src="https://elearningindustry.com/wp-content/uploads/2018/02/10-top-elearning-resources-that-help-you-learn-anything-today.jpeg">
		
	</body>
</html>