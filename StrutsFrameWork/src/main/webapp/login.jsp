<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login - Training</title>
</head>
<body>
	<label><bean:message key="login"/></label>
	<!--  -->
	<% String error = (String)request.getAttribute("errorlogin");
	if(error==null)
		error="";
	%>
	<a style="color: red;"><%=error%></a>
	<html:form action="/login" method="post">
		<p>Username :</p>
		<html:text property="username" />
		<br>
		<p>Password :</p>
		<html:password property="password" />
		<br>
		<html:submit value="login"/>
		<html:reset value="clear"/>
		<html:button property="/login.do" value="click"/>
	</html:form>
</body>
</html>