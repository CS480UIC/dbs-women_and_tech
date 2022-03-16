<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update mentee</title>
    
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
  <h1>Update mentee</h1>
<form action="<c:url value='/Entity1ServletUpdate'/>" method="post">
	<input type="hidden" name="method" value="search"/>
	member_id:<input type="text" name="member_id" value="${form.member_id }"/>
	<span style="color: red; font-weight: 900">${errors.member_id }</span>
	<br/>
	field_of_interest：<input type="text" name="field_of_interest" value="${form.field_of_interest }"/>
	<span style="color: red; font-weight: 900">${errors.field_of_interest }</span>
	<br/>
	 mentor_id：<input type="text" name="mentor_id" value="${form.mentor_id }"/>
	<span style="color: red; font-weight: 900">${errors.mentor_id }</span>
	<br/>
	major：<input type="text" name="major" value="${form.major }"/>
	<span style="color: red; font-weight: 900">${errors.major }</span>
	<br/>
	school_name：<input type="text" name="school_name" value="${form.school_name }"/>
	<span style="color: red; font-weight: 900">${errors.school_name }</span>
	<br/>
	<input type="submit" value="Update mentee"/>
</form>
  </body>
</html>
