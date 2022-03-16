<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update Network Event</title>
    
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
  <h1>Update Network Event</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Event ID    		:<input type="text" name="eventID" value="${network_event.eventID }" disabled/>
	<br/>
	Member ID 		：<input type="text" name="memberID" value="${network_event.memberID }" disabled/>
	<br/>
	Event Title 		：<input type="text" name="eventTitle" value="${network_event.eventTitle }" disabled/>
	<br/>
	Event Address ：<input type="text" name="eventAddress" value="${network_event.eventAddress}" disabled/>
	<br/>
	Event Date	：<input type="text" name="eventDate" value="${network_event.eventDate }" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/ScholarshipServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="eventID" value="${network_event.eventID }"/>
	Member ID：<input type="password" name="memberID" value="${form.memberID }"/>
	<span style="color: red; font-weight: 900">${errors.memberID }</span>
	<br/>
	Event Title	：<input type="text" name="eventTitle" value="${form.eventTitle }"/>
	<span style="color: red; font-weight: 900">${errors.eventTitle }</span>
	<br/>
	Event Address	：<input type="text" name="eventAddress" value="${form.eventAddress}"/>
	<span style="color: red; font-weight: 900">${errors.eventAddress }</span>
	<br/>
	Event Date	：<input type="text" name="eventDate" value="${form.eventDate }"/>
	<span style="color: red; font-weight: 900">${errors.eventDate }</span>
	<br/>
	<input type="submit" value="Update Event"/>
</form>

</body>
</html>
