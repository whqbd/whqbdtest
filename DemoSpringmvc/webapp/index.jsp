<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${request.contextPath}" scope="request"/>
<%
	System.out.println(request.getContextPath()+"== request.getContextPath()====" );
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello 
<form action="student/addStudent" method="post" >
	姓名：<input name="name" type="text" /><br>
	年龄<input name="age" type="text" /><br>
	性别  <select name="gender">
		   <option value="">请选择</option>
		   <option value="0">女</option>
		   <option value="1">男</option>
	 	 </select><br>
	地址<input name="address" type="text" /><br>
	<input type="submit" value="提交">
</form>
</body>
</html>