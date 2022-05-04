<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Mentee</title>
    
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
  <h1>Delete Mentee</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/MenteeServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
	<input type="hidden" name="member_id" value="${mentee.member_id }" />
	member_id:<input type=text name="member_id" value="${mentee.member_id}" disabled/>
	<br/>
	field_of_interest：<input type="text" name="field_of_interest" value="${mentee.field_of_interest}" disabled/>
	<br/>
	major：<input type="text" name="major" value="${mentee.major}" disabled/>

	<br/>
	school_name：<input type="text" name="school_name" value="${mentee.school_name}" disabled/>
	<br/>
	<input type="submit" value="Delete Mentee"/>
</form>

</body>
</html>
