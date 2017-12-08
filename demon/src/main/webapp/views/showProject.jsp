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
	<h3>project information</h3>
	<form action="<%=path%>/project/findAllProject" method="post">
		<input type="hidden" name="id" value="${pro.id}">
		<table>
			<tr>
				<td>Name:</td>
				<td>${pro.name }</td>
			</tr>
			<tr>
				<td>ID:</td>
				<td>${pro.id }</td>
			</tr>
			<tr>
				<td>description:</td>
				<td>${pro.description }</td>
			</tr>
			<tr>
				<td>mentor:</td>
				<td>${pro.mentor }</td>
			</tr>

			<tr>
				<td><input type="submit" value="return"></td>
			</tr>
		</table>
	</form>
</body>
</html>