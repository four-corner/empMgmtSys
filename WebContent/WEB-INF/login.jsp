<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<s:head />
</head>
<body>
	<h1>Learn Java</h1>
	<h3>Account Login</h3>
	<font color="red" size="4">${ exception }</font>
	<s:form action="LoginSubmit">
		<s:textfield name="username" label="User Name" />
		<s:password name="password" label="Password" />
		<s:submit />
	</s:form>

</body>
</html>