<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Mentor</title>
    
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
  <h1>Delete Mentor</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/MentorServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
	<input type="hidden" name="member_id" value="${mentor.member_id }" />
	member_id:<input type="text" name="member_id" value="${mentor.member_id }" disabled/>
	<br/>
	years_in_industry：<input type="text" name="years_in_industry" value="${mentor.years_in_industry }" disabled/>
	<br/>
	role_in_industry：<input type="text" name="role_in_industry" value="${mentor.role_in_industry }" disabled/>
	<br/>
	years_of_mentoring：<input type="text" name="years_of_mentoring" value="${mentor.years_of_mentoring }" disabled/>
	<br/>
	<input type="submit" value="Delete Mentor"/>
</form>

</body>
</html>
