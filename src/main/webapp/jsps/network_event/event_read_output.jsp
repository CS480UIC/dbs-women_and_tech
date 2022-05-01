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
	Event ID    		:<input type="text" name="eventID" value="${eventnetwork.event_id}" disabled/>
	<br/>
	Member ID 		：<input type="text" name="memberID" value="${eventnetwork.member_id}" disabled/>
	<br/>
	Event Title 		：<input type="text" name="eventTitle" value="${eventnetwork.event_title }" disabled/>
	<br/>
	Event Address ：<input type="text" name="eventAddress" value="${eventnetwork.event_address}" disabled/>
	<br/>
	Event Date	：<input type="date" name="eventDate" value="${eventnetwork.event_date}" disabled/>
	<br/>
</form>


<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
