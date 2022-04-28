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
	Event ID    	:<input type="text" name="eventID" value="${eventNetwork.event_id }" disabled/>
	<br/>

</form>
<h1>Update the values below</h1>
<form action="<c:url value='/EventNetworkServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="eventID" value="${eventNetwork.event_id }"/>
	Member ID	：<input type="text" name="memberID" value="${form.member_id }"/>
	<span style="color: red; font-weight: 900">${errors.member_id }</span>
	<br/>	
	Event Title	：<input type="text" name="eventTitle" value="${form.event_title}"/>
	<span style="color: red; font-weight: 900">${errors.event_title}</span>
	<br/>
	Event Address	：<input type="text" name="eventAddress" value="${form.event_address}"/>
	<span style="color: red; font-weight: 900">${errors.event_address}</span>
	<br/>
	Event Date	：<input type="date" name="eventDate" value="${form.event_date }"/>
	<span style="color: red; font-weight: 900">${errors.event_date}</span>
	<br/>
	<input type="submit" value="Update Event"/>
</form>

</body>
</html>
