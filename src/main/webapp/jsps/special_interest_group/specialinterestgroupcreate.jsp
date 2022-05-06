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
<form action="<c:url value='/Special_Interest_GroupServletCreate'/>" method="post">
	Group ID    		:<input type="number" name="group_id" value="${form.group_id }"/>
	<span style="color: red; font-weight: 900">${errors.group_id }</span>
	<br/>
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
	<input type="submit" value="Create Scholarship"/>
</form>
  </body>
</html>
