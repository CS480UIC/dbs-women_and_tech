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
	Scholarship ID    		:<input type="text" name="scholarshipID" value="${scholarship.scholarshipID }"/>
	<br/>
	Scholarship Name 		：<input type="text" name="scholarshipName" value="${scholarship.scholarshipName }"/>
	<br/>
	Scholarship Amount 		：<input type="text" name="scholarshipAmount" value="${scholarship.scholarshipAmount }"/>
	<br/>
	Scholarship Description ：<input type="text" name="scholarshipDescription" value="${scholarship.scholarshipDescription}"/>
	<br/>
	Scholarship Deadline	：<input type="text" name="scholarshipDeadline" value="${scholarship.scholarshipDeadline }"/>
	<br/>
	Scholarship Released	：<input type="text" name="scholarshipReleased" value="${scholarship.scholarshipReleased }"/>
	<br/>
	Scholarship Requirements ：<input type="text" name="scholarshipRequirements" value="${scholarship.scholarshipRequirements }"/>
	<br/>
</form>

<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
