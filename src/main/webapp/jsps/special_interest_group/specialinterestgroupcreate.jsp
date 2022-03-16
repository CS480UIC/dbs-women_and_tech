<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Special Interest Group Create</title>
    
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
  <h1>Special Interest Group Create</h1>
<form action="<c:url value='/SpecialInterestGroupServletCreate'/>" method="post">
	Group ID    		:<input type="text" name="groupID" value="${form.groupID }"/>
	<span style="color: red; font-weight: 900">${errors.groupID }</span>
	<br/>
	Members ID 		：<input type="text" name="membersID" value="${form.membersID }"/>
	<span style="color: red; font-weight: 900">${errors.membersID }</span>
	<br/>
	Mission Statement 		：<input type="text" name="missionStatement" value="${form.missionStatement }"/>
	<span style="color: red; font-weight: 900">${errors.missionStatement }</span>
	<br/>
	Type ：<input type="text" name="type" value="${form.type}"/>
	<span style="color: red; font-weight: 900">${errors.type }</span>
	<br/>
	Web Page URL	：<input type="text" name="webPageURL" value="${form.webPageURL }"/>
	<span style="color: red; font-weight: 900">${errors.webPageURL }</span>
	<br/>
	Date Created	：<input type="text" name="dateCreated" value="${form.dateCreated }"/>
	<span style="color: red; font-weight: 900">${errors.dateCreated }</span>
	<br/>
	<input type="submit" value="Create Scholarship"/>
</form>
  </body>
</html>
