<pre class="html" name="code"><%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<title>新增学生信息页面</title>
</head>
<body>
	<h3>添加页面</h3>
	<form action="<%=path%>/student/addStudent" method="post">
		<table>
			<tr>
				<td>name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>id:</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>address:</td>
				<td><input type="text" name="addr"></td>
			</tr>
			<tr>
				<td>gender:</td>
				<td><select name="gender">
						<option value="female">female</option>
						<option value="male">male</option>
						<option value="other">other</option>
				</select></td>
			</tr>
			
			
			<tr>
				<td>tel:</td>
				<td><input type="text" name="tel"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
				<td><input type="reset" value="reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>
