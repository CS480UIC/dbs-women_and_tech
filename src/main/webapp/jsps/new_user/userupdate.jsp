<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update User</title>
    
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
  <h1>Update User</h1>
<form action="<c:url value='/Entity1ServletUpdate'/>" method="post">
	<input type="hidden" name="method" value="search"/>
	 member_id:<input type="text" name="member_id" value="${form.member_id }"/>
	<span style="color: red; font-weight: 900">${errors.member_id }</span>
	<br/>
	first_name：<input type="text" name="first_name" value="${form.first_name }"/>
	<span style="color: red; font-weight: 900">${errors.first_name }</span>
	<br/>
	last_name：<input type="text" name="last_name" value="${form.last_name }"/>
	<span style="color: red; font-weight: 900">${errors.last_name }</span>
	<br/>
	birthday：<input type="text" name="birthday" value="${form.birthday }"/>
	<span style="color: red; font-weight: 900">${errors.birthday }</span>
	<br/>
	education_level：<input type="text" name="education_level" value="${form.education_level }"/>
	<span style="color: red; font-weight: 900">${errors.education_level }</span>
	<br/>
	email：<input type="text" name="email" value="${form.email }"/>
	<span style="color: red; font-weight: 900">${errors.email }</span>
	<br/>
	bio：<input type="text" name="bio" value="${form.bio }"/>
	<span style="color: red; font-weight: 900">${errors.bio }</span>
	<br/>
	<input type="submit" value="Update User"/>
</form>
  </body>
</html>
