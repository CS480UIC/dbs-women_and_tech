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
  <h1>Update Learning Resource</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Resource ID   : <input type="text" name="resourceID" value="${learning_resource.resourceID }" disabled/>
	<br/>
	Member ID：<input type="password" name="memberID" value="${learning_resource.memberID }" disabled/>
	<br/>
	Resource Title	：<input type="text" name="resourceTitle" value="${learning_resource.resourceTitle }" disabled/>
	<br/>
	Resource Type	：<input type="text" name="resourceType" value="${learning_resource.resourceType}" disabled/>
	<br/>
	Author	：<input type="text" name="author" value="${learning_resource.author }" disabled/>
	<br/>
	Publisher	：<input type="text" name="publisher" value="${learning_resource.publisher }" disabled/>
	<br/>
	Publish Year	：<input type="text" name="publishYear" value="${learning_resource.publishYear}" disabled/>
	<br/>
	Language	：<input type="text" name="language" value="${learning_resource.language }" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/SpecialInterestGroupServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="username" value="${learning_resource.resourceID }"/>
	Resource ID   : <input type="text" name="resourceID" value="${form.resourceID }"/>
	<span style="color: red; font-weight: 900">${errors.resourceID }</span>
	<br/>
	Member ID：<input type="password" name="memberID" value="${form.memberID }"/>
	<span style="color: red; font-weight: 900">${errors.memberID }</span>
	<br/>
	Resource Title	：<input type="text" name="resourceTitle" value="${form.resourceTitle }"/>
	<span style="color: red; font-weight: 900">${errors.resourceTitle }</span>
	<br/>
	Resource Type	：<input type="text" name="resourceType" value="${form.resourceType}"/>
	<span style="color: red; font-weight: 900">${errors.resourceType }</span>
	<br/>
	Author	：<input type="text" name="author" value="${form.author }"/>
	<span style="color: red; font-weight: 900">${errors.author }</span>
	<br/>
	Publisher	：<input type="text" name="publisher" value="${form.publisher }"/>
	<span style="color: red; font-weight: 900">${errors.publisher }</span>
	<br/>
	Publish Year	：<input type="text" name="publishYear" value="${form.publishYear}"/>
	<span style="color: red; font-weight: 900">${errors.publishYear }</span>
	<br/>
	Language	：<input type="text" name="language" value="${form.language }"/>
	<span style="color: red; font-weight: 900">${errors.language }</span>
	<br/>
	<input type="submit" value="Update Resource"/>
</form>

</body>
</html>
