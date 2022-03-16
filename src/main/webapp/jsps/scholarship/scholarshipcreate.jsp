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
	Scholarship ID    		:<input type="text" name="scholarshipID" value="${form.scholarshipID }"/>
	<span style="color: red; font-weight: 900">${errors.scholarshipID }</span>
	<br/>
	Scholarship Name 		：<input type="text" name="scholarshipName" value="${form.scholarshipName }"/>
	<span style="color: red; font-weight: 900">${errors.scholarshipName }</span>
	<br/>
	Scholarship Amount 		：<input type="text" name="scholarshipAmount" value="${form.scholarshipAmount }"/>
	<span style="color: red; font-weight: 900">${errors.scholarshipAmount }</span>
	<br/>
	Scholarship Description ：<input type="text" name="scholarshipDescription" value="${form.scholarshipDescription}"/>
	<span style="color: red; font-weight: 900">${errors.scholarshipDescription }</span>
	<br/>
	Scholarship Deadline	：<input type="text" name="scholarshipDeadline" value="${form.scholarshipDeadline }"/>
	<span style="color: red; font-weight: 900">${errors.scholarshipDeadline }</span>
	<br/>
	Scholarship Released	：<input type="text" name="scholarshipReleased" value="${form.scholarshipReleased }"/>
	<span style="color: red; font-weight: 900">${errors.scholarshipReleased }</span>
	<br/>
	Scholarship Requirements ：<input type="text" name="scholarshipRequirements" value="${form.scholarshipRequirements }"/>
	<span style="color: red; font-weight: 900">${errors.scholarshipRequirements }</span>
	<br/>
	<input type="submit" value="Create Scholarship"/>
</form>
  </body>
</html>
