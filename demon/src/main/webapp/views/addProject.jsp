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
	<h3>add new project</h3>
	<form action="<%=path%>/project/addProject" method="post">
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
				<td>description:</td>
				<td><input type="text" name="description"></td>
			</tr>
			<tr>
				<td>mentor:</td>
				<td><input type="text" name="mentor"></td>
			</tr>

			<tr>
				<td><input type="submit" value="submit"></td>
				<td><input type="reset" value="reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>
