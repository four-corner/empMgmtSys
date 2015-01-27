<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<body>
	<table width="99%" height="99%" bgcolor="#c3d599">
		<tr height="10%">
			<td colspan="2" align="center"><tiles:insertAttribute name="HEADER"></tiles:insertAttribute></td>
		</tr>
		<tr height="85%">
			<td width="20%" valign="top"><tiles:insertAttribute name="LMENU"></tiles:insertAttribute></td>
			<td width="20%" valign="top"><tiles:insertAttribute name="BODY"></tiles:insertAttribute></td>
		</tr>
		<tr height="5%">
			<td colspan="2" align="center"><tiles:insertAttribute
					name="FOOTER"></tiles:insertAttribute></td>
		</tr>
	</table>
</body>
</html>