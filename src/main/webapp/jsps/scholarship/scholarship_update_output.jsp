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
	Scholarship ID    		:<input type="text" name="scholarshipID" value="${scholarship.scholarshipID }" disabled/>
	<br/>
	Scholarship Name 		：<input type="text" name="scholarshipName" value="${scholarship.scholarshipName }" disabled/>
	<br/>
	Scholarship Amount 		：<input type="text" name="scholarshipAmount" value="${scholarship.scholarshipAmount }" disabled/>
	<br/>
	Scholarship Description ：<input type="text" name="scholarshipDescription" value="${scholarship.scholarshipDescription}" disabled/>
	<br/>
	Scholarship Deadline	：<input type="text" name="scholarshipDeadline" value="${scholarship.scholarshipDeadline }" disabled/>
	<br/>
	Scholarship Released	：<input type="text" name="scholarshipReleased" value="${scholarship.scholarshipReleased }" disabled/>
	<br/>
	Scholarship Requirements ：<input type="text" name="scholarshipRequirements" value="${scholarship.scholarshipRequirements }" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/ScholarshipServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="username" value="${scholarship.scholarshipID }"/>
	Scholarship Name：<input type="text" name="scholarshipName" value="${form.scholarshipName }"/>
	<span style="color: red; font-weight: 900">${errors.scholarshipName }</span>
	<br/>
	Scholarship Amount	：<input type="text" name="scholarshipAmount" value="${form.scholarshipAmount }"/>
	<span style="color: red; font-weight: 900">${errors.scholarshipAmount }</span>
	<br/>
	Scholarship Description	：<input type="text" name="scholarshipDescription" value="${form.scholarshipDescription}"/>
	<span style="color: red; font-weight: 900">${errors.scholarshipDescription }</span>
	<br/>
	Scholarship Deadline	：<input type="text" name="scholarshipDeadline" value="${form.scholarshipDeadline }"/>
	<span style="color: red; font-weight: 900">${errors.scholarshipDeadline }</span>
	<br/>
	Scholarship Requirements	：<input type="text" name="scholarshipRequirements" value="${form.scholarshipRequirements }"/>
	<span style="color: red; font-weight: 900">${errors.scholarshipRequirements }</span>
	<br>
	<input type="submit" value="Update Scholarship"/>
</form>

</body>
</html>
