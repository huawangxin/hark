<!DOCTYPE html>
<%@ page contentType="text/html; charset=GBK" %>
<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ա������ģ��</title>
</head>
<body>
<form id="employeeForm1" >
	�û�����<input type="text" name="employee.name" /><br />
	���룺<input type="text" name="employee.password" /><br />
	<input type="button" name="btnadd" onclick="addEmployee()" value="����" />
	<input type="button" name="btnmodify" onclick="modifyEmployee()" value="�޸�" />
	<input type="button" name="btndel" onclick="deleteEmployee()" value="ɾ��"  />
</form>


</body>
<script>
function addEmployee(){
	var myform=document.forms[0];
	myform.action="employee/addEmployee_success";
	myform.method="post";
	myform.submit();
}

function modifyEmployee(){
	var myform=document.forms[0];
	myform.action="employee/modifyEmployee_success";
	myform.method="post";
	myform.submit();
}

function deleteEmployee(){
	var myform=document.forms[0];
	myform.action="employee/deleteEmployee_success";
	myform.method="post";
	myform.submit();
}
</script>
</html>