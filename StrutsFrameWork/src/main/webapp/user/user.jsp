<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome User</title>
</head>
<body>
<h3>Add User Thành Công</h3>
<p>UserName: </p><bean:write name="user" property="username"/> 
<br>
<p>Password: </p><bean:write name="user" property="password"/>
</body>
</html>