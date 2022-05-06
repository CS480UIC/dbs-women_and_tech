<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Scholarship Create</title>
    
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
  <h1>Scholarship Create</h1>
<form action="<c:url value='/ScholarshipServletCreate'/>" method="post">
	Scholarship ID    		:<input type="number" name="scholarship_id" value="${form.scholarship_id}"/>
	<span style="color: red; font-weight: 900">${errors.scholarship_id }</span>
	<br/>
	Scholarship Name 		：<input type="text" name="scholarship_name" value="${form.scholarship_name}"/>
	<span style="color: red; font-weight: 900">${errors.scholarship_name }</span>
	<br/>
	Scholarship Amount 		：<input type="number" name="scholarship_amount" value="${form.scholarship_amount}"/>
	<span style="color: red; font-weight: 900">${errors.scholarship_amount }</span>
	<br/>
	Scholarship Description ：<input type="text" name="scholarship_description" value="${form.scholarship_description}"/>
	<span style="color: red; font-weight: 900">${errors.scholarship_description }</span>
	<br/>
	Scholarship Deadline	：<input type="date" name="application_deadline" value="${form.application_deadline}"/>
	<span style="color: red; font-weight: 900">${errors.application_deadline }</span>
	<br/>
	Scholarship Released	：<input type="date" name="application_released" value="${form.application_released}"/>
	<span style="color: red; font-weight: 900">${errors.application_released }</span>
	<br/>
	Scholarship Requirements ：<input type="text" name="requirements" value="${form.requirements }"/>
	<span style="color: red; font-weight: 900">${errors.requirements }</span>
	<br/>
	<input type="submit" value="Create Scholarship"/>
</form>
  </body>
</html>
