<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aware Test Jsp</title>
</head>
<body>

	<h4>Aware Test</h4>
	
	application: ${applicationScope.applicationKey2}
	<br/><br/>
	session: ${sessionScope.sessionKey2}
	<br/><br/>
	request: ${requestScope.requestKey2}
	<br/><br/>
	params: ${parameters.name[0]}
	
</body>
</html>