<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<body>
	<s:url id="postRequest" action="PostRequestDisplay" />
	<h3>
		Welcome
		<s:property value="#session.ETO.username" />
		<br>
		<s:a href="%{postRequest}">Post Request</s:a>
		<br> View Requests
	</h3>
</body>
</html>