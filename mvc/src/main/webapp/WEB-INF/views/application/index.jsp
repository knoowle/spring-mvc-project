<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title}</title>
<link href="css/main.css" type="text/css" rel="stylesheet" />
</head>
<body>
<h1>${logo}</h1>
<p>add blog</p>
<spring:url value="/addblog/" var="addblog"/>
<form action="${addblog}">
	<p><label>title</label><input name="title" /></p>
	<p><label>content</label>
	<textarea rows="20" cols="30" name="content"></textarea>
	</p>
	<p><input type="submit" /></p>
</form>
</body>
</html>