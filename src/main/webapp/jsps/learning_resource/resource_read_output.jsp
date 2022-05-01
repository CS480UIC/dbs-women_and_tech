<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read Learning Resource</title>
    
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
  <h1>Read Learning Resource</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Resource ID   : <input type="text" name="resourceID" value="${learning_resource.resource_id }" disabled/>
	<br/>
	Member ID：<input type="text" name="memberID" value="${learning_resource.member_id }" disabled/>
	<br/>
	Resource Title	：<input type="text" name="resourceTitle" value="${learning_resource.resource_title }" disabled/>
	<br/>
	Resource Type	：<input type="text" name="resourceType" value="${learning_resource.resource_type}" disabled/>
	<br/>
	Author	：<input type="text" name="author" value="${learning_resource.author }" disabled/>
	<br/>
	Publisher	：<input type="text" name="publisher" value="${learning_resource.publisher }" disabled/>
	<br/>
	Publish Year	：<input type="text" name="publishYear" value="${learning_resource.publish_year}" disabled/>
	<br/>
	Language	：<input type="text" name="language" value="${learning_resource.resource_language}" disabled/>
	<br/>
</form>

<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
