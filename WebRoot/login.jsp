<!DOCTYPE html>
<%@ page contentType="text/html; charset=GBK" %>
<%@ page import="java.util.*"%>
<html>
<%
String error_meg= (String)request.getAttribute("error_meg");
if(error_meg==null){
	error_meg="";
}

%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
<form action="login" method="post">
	用户名:<input type="text" name="employee.loginName"/><br />
	密码:<input type="password" name="employee.password"/><br />
	<input type="submit" value="登录" />
	<%=error_meg %>
</form>
</body>
</html>