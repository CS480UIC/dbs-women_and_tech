<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Delete Network Event</title>

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
	<h1>Delete Network Event</h1>
	<p style="color: red; font-weight: 900">${msg }</p>
	<form action="<c:url value='/EventNetworkServletDelete'/>" method="post">
		<input type="hidden" name="method" value="delete" /> <input
			type="hidden" name="eventID" value="${eventNetwork.eventID }" />
	event_id    :<input type="text" name="event_id" value="${eventNetwork.member_id }" disabled/>
	<br/>
	
	member_id：<input type="text" name="member_id" value="${eventNetwork.member_id }" disabled/>
	<br/>
	
	event_title	：<input type="text" name="event_title" value="${eventNetwork.event_title }" disabled/>
	<br/>
	
	event_address：<input type="text" name="event_address" value="${eventNetwork.event_address }" disabled/>
	<br/>
	
	event_date	：<input type="text" name="event_date" value="${eventNetwork.event_date }" disabled/>
	<br/>
	<input type="submit" value="Delete Event"/>
	</form>

</body>
</html>
