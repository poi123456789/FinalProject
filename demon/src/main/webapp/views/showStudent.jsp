<pre class="html" name="code"><%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ page isELIgnored="false" %>
<html>
<head>
<title>saveStudent.jsp</title>
</head>
<body>
	<h3>student's information</h3>
	<form action="<%=path%>/student/findAllStudent" method="post">
		<input type="hidden" name="id" value="${stu.id}">
		<table>
			<tr>
				<td>Name:</td>
				<td>${stu.name }</td>
			</tr>
			<tr>
				<td>ID:</td>
				<td>${stu.id }</td>
			</tr>
			<tr>
				<td>address:</td>
				<td>${stu.addr }</td>
			</tr>
			<tr>
				<td>gender:</td>
				<td>${stu.gender }</td>
			</tr>
			
			<tr>
				<td>tel:</td>
				<td>${stu.tel }</td>
			</tr>
			<tr>
				<td><input type="submit" value="return"></td>
			</tr>
		</table>
	</form>
</body>
</html>