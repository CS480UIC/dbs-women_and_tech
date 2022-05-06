<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="">
    
    <title>body</title>
    
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
    <h1>List of Queries</h1>
    <br> 
    <a href="<c:url value='/findAll'/>" target="body">list all the user in the table</a>&nbsp;
    <br>
    <br>
    <a href="<c:url value='/findLRBook'/>" target="body">List all the learning resource book - Simply Query</a>&nbsp;
    <br>
    <br>
    <a href="<c:url value='/findLR'/>" target="body">Learning Resource Table - Complex Query</a>
    <br>
    <br>
    <a href="<c:url value='/findARUser'/>" target="body">Network Event Table - Simple Query</a>
    <br>
    <br>
    <a href="<c:url value='/findMemberEvent'/>" target="body">List Number of Member for Network Event - Aggregate Queries</a>&nbsp;
    <br>
    <br>
    <a href="<c:url value='/findMentee'/>" target="body">List all the Mentees - Simply Query</a>&nbsp;
    <br>
    <br>
    <a href="<c:url value='/findMentor'/>" target="body">List all the Mentors - Complex Query</a>&nbsp;
    <br>
    <br>
    <a href="<c:url value='/findScholarship'/>" target="body">List all the Scholarships with amounts > $700 - Simple Query</a>&nbsp;
    <br>
    <br>
    <a href="<c:url value='/findScholarshipLike'/>" target="body">List all the Scholarships like 'bootcamp' - Aggregate Query</a>&nbsp;
  	<br>
    <br>
    <a href="<c:url value='/findScholarshipRoundSqrt'/>" target="body">List all the Scholarships amounts square rooted and rounded to the 1 decimal place  - Aggregate Query</a>&nbsp;
  	<br>
    <br>
    <a href="<c:url value='/findScholarshipAvg'/>" target="body">List all the Scholarships greater than the average scholarship amount - Complex Query</a>&nbsp;
  	<br>
    <br>
   
  </body>
</html>
