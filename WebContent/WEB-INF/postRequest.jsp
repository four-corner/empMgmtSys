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
	<h3>Post your Request</h3>
	<s:actionerror />

	<s:form action="PostRequestSubmit">
		<s:select name="priority" label="Select Priority"
			list="{'Low', 'Medium', 'High', 'Critical'}" multiple="false" />

		<s:textarea name="description" label="Type Request Info" cols="15"
			rows="6" />

		<s:submit value="Post Request Now" />
	</s:form>

</body>
</html>