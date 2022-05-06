 <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read Scholarship</title>
    
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
  <h1>Read Scholarship</h1>
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

<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
