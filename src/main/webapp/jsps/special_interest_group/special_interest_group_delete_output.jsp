<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Special Interest group</title>
    
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
  <h1>Delete Special Interest Group</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/SpecialInterestgroupServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
		<input type="hidden" name="username" value="${special_interest_group.groupID }"/>
	Group ID    		:<input type="text" name="groupID" value="${special_interest_group.groupID }" disabled/>
	<br/>
	Members ID 		：<input type="text" name="membersID" value="${special_interest_group.membersID }" disabled/>
	<br/>
	Mission Statement 		：<input type="text" name="missionStatement" value="${special_interest_group.missionStatement }" disabled/>
	<br/>
	Type ：<input type="text" name="type" value="${special_interest_group.type}" disabled/>
	<br/>
	Web Page URL	：<input type="text" name="webPageURL" value="${special_interest_group.webPageURL }" disabled/>
	<br/>
	Date Created	：<input type="text" name="dateCreated" value="${special_interest_group.dateCreated }" disabled/>
	<br/>
	<input type="submit" value="Delete Special Interest Group"/>
</form>

</body>
</html>
