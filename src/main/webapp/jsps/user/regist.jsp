<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Register</title>

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
	<h1>Register</h1>

	<p style="color: red; font-weight: 900">${msg }</p>
	<form action="<c:url value='/UserServletRegister'/>" method="post">
		<input type="hidden" name="method" value="regist" /> First Name :<input
			type="text" name="firstName" value="${form.first_name }" /> <span
			style="color: red; font-weight: 900">${errors.first_name }</span> <br />
		Last Name :<input type="text" name="lastName"
			value="${form.last_name }" /> <span
			style="color: red; font-weight: 900">${errors.last_name }</span> <br />
		Password：<input type="password" name="password"
			value="${form.member_password }" /> <span
			style="color: red; font-weight: 900">${errors.member_password }</span>
		<br /> Email ：<input type="text" name="email" value="${form.email }" />
		<span style="color: red; font-weight: 900">${errors.email }</span> <br />
		Birthday ：<input type="date" name="birthday" value="${form.birthday }" />
		<span style="color: red; font-weight: 900">${errors.birthday }</span>
		<br /> Education Level ：<input type="text" name="eduacationLevel"
			value="${form.education_level }" /> <span
			style="color: red; font-weight: 900">${errors.education_level }</span>
		<br /> Bio ：<input type="text" name="bio" value="${form.bio }" /> <span
			style="color: red; font-weight: 900">${errors.bio }</span> <br /> <input
			type="submit" value="Register" />

	</form>
</body>
</html>
