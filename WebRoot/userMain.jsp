<!DOCTYPE html>
<%@ page contentType="text/html; charset=GBK" %>
<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	//var myfrom=document.getElementById("myform1");

	
	function addUser()
	{
		var myform=document.forms[0];
		myform.action="employee/addEmployee_success";
		myform.method="post";
		myform.submit();
	}
	
	function modifyUser()
	{
		var myform=document.forms[0];
		myform.action="employee/modifyEmployee_success";
		myform.method="post";
		myform.submit();
	}
	
	function deleteUser()
	{
		var myform=document.forms[0];
		myform.action="employee/deleteEmployee_success";
		myform.method="post";
		myform.submit();
	}
	
	

</script>
</head>
<body>
<form id="myform1" >
	�û�����<input type="text" name="employee.name" /><br />
	���룺<input type="text" name="employee.password" /><br />
	<input type="button" name="btnadd" onclick="addEmployee()" value="����" />
	<input type="button" name="btnmodify" onclick="modifyEmployee()" value="�޸�" />
	<input type="button" name="btndel" onclick="deleteEmployee()" value="ɾ��"  />
 </form>
</body>
</html>