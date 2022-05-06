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
  <h1>Update Special Interest Group</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
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
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/Special_Interest_GroupServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="group_id" value="${special_interest_group.group_id }"/>
	Group Name    		:<input type="text" name="group_name" value="${form.group_name }"/>
	<span style="color: red; font-weight: 900">${errors.group_name }</span>
	<br/>
	Members ID 		：<input type="number" name="members_id" value="${form.members_id }"/>
	<span style="color: red; font-weight: 900">${errors.members_id }</span>
	<br/>
	Mission Statement 		：<input type="text" name="mission_statement" value="${form.mission_statement }"/>
	<span style="color: red; font-weight: 900">${errors.mission_statement }</span>
	<br/>
	Type ：<input type="text" name="group_type" value="${form.group_type}"/>
	<span style="color: red; font-weight: 900">${errors.group_type }</span>
	<br/>
	Web Page URL	：<input type="text" name="webpage_url" value="${form.webpage_url }"/>
	<span style="color: red; font-weight: 900">${errors.webpage_url }</span>
	<br/>
	Date Created	：<input type="date" name="date_created" value="${form.date_created }"/>
	<span style="color: red; font-weight: 900">${errors.date_created }</span>
	<br/>
	<input type="submit" value="Update Special Interest Group"/>
</form>

</body>
</html>
