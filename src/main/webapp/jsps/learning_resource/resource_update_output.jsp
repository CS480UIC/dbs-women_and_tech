<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update Learning Resource</title>
    
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
 
<h1>Update the values below</h1>
<form action="<c:url value='/LearningResourceServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="resourceID" value="${learning_resource.resourceID }"/>
				<input type="hidden" name="memberID" value="${learning_resource.memberID  }"/>
				
	Resource Title	：<input type="text" name="resourceTitle" value="${form.resource_title }"/>
	<span style="color: red; font-weight: 900">${errors.resource_title }</span>
	<br/>
	Resource Type	：<input type="text" name="resourceType" value="${form.resource_type}"/>
	<span style="color: red; font-weight: 900">${errors.resource_type }</span>
	<br/>
	Author	：<input type="text" name="author" value="${form.author }"/>
	<span style="color: red; font-weight: 900">${errors.author }</span>
	<br/>
	Publisher	：<input type="text" name="publisher" value="${form.publisher }"/>
	<span style="color: red; font-weight: 900">${errors.publisher }</span>
	<br/>
	Publish Year	：<input type="text" name="publishYear" value="${form.publish_year}"/>
	<span style="color: red; font-weight: 900">${errors.publish_year }</span>
	<br/>
	Language	：<input type="text" name="language" value="${form.resource_language }"/>
	<span style="color: red; font-weight: 900">${errors.resource_language }</span>
	<br/>
	<input type="submit" value="Update Resource"/>
</form>

</body>
</html>
