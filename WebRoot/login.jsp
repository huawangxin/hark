<!DOCTYPE html>
<%@ page contentType="text/html; charset=GBK" %>
<%@ page import="java.util.*"%>
<html>
<%
String error_msg= (String)session.getAttribute("error_msg");
System.out.println(error_msg);
if(error_msg==null){
	error_msg="";
}
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>��¼ҳ��</title>
</head>
<body>
<form action="login" method="post">
	�û���:<input type="text" name="employee.loginName"/><br />
	����:<input type="password" name="employee.password"/><br />
	<input type="submit" value="��¼" />
	<%=error_msg %>
</form>
</body>
</html>