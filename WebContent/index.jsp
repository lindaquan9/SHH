<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Just Test</title>
</head>
<body>
	Just Test
	
	<a href="input.action">click here</a>
	<br/><br/>
	
	<a href="testActionContext.action?name=context">Context Test Jsp</a>
	<br/><br/>
	
	<a href="testAwareAction.action?name=aware">Aware Test Jsp</a>
	<br/><br/>
	
	<a href="login-ui">LoginUI</a>
	<br/><br/>
	
	<a href="test-tags">Tags Test Jsp</a>
	<br/><br/>
	
	
	<%
		if(application.getAttribute("date") == null)
			application.setAttribute("date", new Date());
	%>
	
</body>
</html>