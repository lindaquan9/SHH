<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Context Test Jsp</title>
</head>
<body>

	<h4>Application Context Test</h4>
	
	application: ${applicationScope.applicationKey}
	<br/><br/>
	session: ${sessionScope.sessionKey}
	<br/><br/>
	request: ${requestScope.requestKey}
	<br/><br/>
	params: ${parameters.name[0]}
	
</body>
</html>