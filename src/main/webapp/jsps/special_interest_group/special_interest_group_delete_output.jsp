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
<form action="<c:url value='/Special_Interest_GroupServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
		<input type="hidden" name="group_id" value="${special_interest_group.group_id }"/>
	Group ID    		:<input type="number" name="group_id" value="${special_interest_group.group_id }" disabled/>
	<br/>
	Group Name    		:<input type="text" name="group_name" value="${special_interest_group.group_name }" disabled/>
	<br/>
	Members ID 		：<input type="number" name="members_id" value="${special_interest_group.members_id }" disabled/>
	<br/>
	Mission Statement 		：<input type="text" name="mission_statement" value="${special_interest_group.mission_statement }" disabled/>
	<br/>
	Type ：<input type="text" name="group_type" value="${special_interest_group.group_type}" disabled/>
	<br/>
	Web Page URL	：<input type="text" name="webpage_url" value="${special_interest_group.webpage_url }" disabled/>
	<br/>
	Date Created	：<input type="date" name="date_created" value="${special_interest_group.date_created }" disabled/>
	<br/>
	<input type="submit" value="Delete Special Interest Group"/>
</form>

</body>
</html>
