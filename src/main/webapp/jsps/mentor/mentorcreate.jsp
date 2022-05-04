<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Mentor Create</title>
    
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
  <h1>Mentor Create</h1>
<form action="<c:url value='/MentorServletCreate'/>" method="post">
	 member_id:<input type="text" name="member_id" value="${form.member_id }"/>
	<span style="color: red; font-weight: 900">${errors.member_id }</span>
	<br/>
	years_in_industry：<input type="text" name="years_in_industry" value="${form.years_in_industry }"/>
	<span style="color: red; font-weight: 900">${errors.years_in_industry }</span>
	<br/>
	role_in_industry：<input type="text" name="role_in_industry" value="${form.role_in_industry }"/>
	<span style="color: red; font-weight: 900">${errors.role_in_industry }</span>
	<br/>
	years_of_mentoring：<input type="text" name="years_of_mentoring" value="${form.years_of_mentoring }"/>
	<span style="color: red; font-weight: 900">${errors.years_of_mentoring }</span>
	<br/>
	<input type="submit" value="Create mentor"/>
</form>
  </body>
</html>
