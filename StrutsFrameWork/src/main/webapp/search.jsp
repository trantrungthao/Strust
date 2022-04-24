<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search - Training</title>
</head>
<body>
<h3>Search</h3>
<strong><bean:write name="formLogin" property="username"/></strong>
<label><bean:write name="formLogin" property="password"/></label>
</body>
</html>