<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read Network Event</title>
    
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
  <h1>Read Network Event</h1>
<p style="color: red; font-weight: 900">${msg}</p>
<form>
	Event ID    		:<input type="text" name="eventID" value="${eventNetwork.event_id}"/>
	<br/>
	Member ID 		：<input type="text" name="memberID" value="${eventNetwork.member_id}"/>
	<br/>
	Event Title 		：<input type="text" name="eventTitle" value="${eventNetwork.event_title }"/>
	<br/>
	Event Address ：<input type="text" name="eventAddress" value="${eventNetwork.event_address}"/>
	<br/>
	Event Date	：<input type="date" name="eventDate" value="${eventNetwork.event_date}"/>
	<br/>
</form>


<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
