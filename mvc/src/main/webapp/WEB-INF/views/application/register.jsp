<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title}</title>
<spring:url value="/css/main.css" var="main_css_url"/>
<link href="${main_css_url}" type="text/css" rel="stylesheet" />
</head>
<body>
<h1>knoowle</h1>
<p>register</p>
<spring:url value="/register" var="register_post_url"/>
<form action="${reister_post_url}" method="post">

</form>
</body>
</html>