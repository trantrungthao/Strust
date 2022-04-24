<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD USER</title>
</head>
<body>
<h3>ADD USER</h3>
<p style="color: red;">
<html:errors/>
</p>
<html:form action="/view-user" method="post">
<label>UserName:</label>
<html:text property="username" name="user"/>
<html:messages id="error_name" property="error.username">
<p style="color: red;">
<bean:write name="error_name"/>
</p>
</html:messages>
<br>
<label>Password:</label>
<html:password property="password" name="user"/>
<html:messages id="error_pass" property="error.password">
<p style="color: red;">
<bean:write name="error_pass"/>
</p>
</html:messages>
<br>
<html:submit value="ADD"/>
</html:form>
</body>
</html>