<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Entity</title>
    
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
  <h1>Update Scholarship</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Scholarship ID    		:<input type="number" name="scholarship_id" value="${scholarship.scholarship_id }" disabled/>
	<br/>
	Scholarship Name 		：<input type="text" name="scholarship_name" value="${scholarship.scholarship_name }" disabled/>
	<br/>
	Scholarship Amount 		：<input type="number" name="scholarship_amount" value="${scholarship.scholarship_amount }" disabled/>
	<br/>
	Scholarship Description ：<input type="text" name="scholarship_description" value="${scholarship.scholarship_description}" disabled/>
	<br/>
	Deadline	            ：<input type="date" name="application_deadline" value="${scholarship.application_deadline }" disabled/>
	<br/>
	Scholarship Released	：<input type="date" name="application_released" value="${scholarship.application_released }" disabled/>
	<br/>
	Scholarship Requirements ：<input type="text" name="requirements" value="${scholarship.requirements }" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/ScholarshipServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="scholarship_id" value="${scholarship.scholarship_id }"/>
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
	<input type="submit" value="Update Scholarship"/>
</form>

</body>
</html>
