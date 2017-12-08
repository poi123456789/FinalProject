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
<title>updateStudent.jsp</title>
</head>
<body>
	<h3>更新页面</h3>
	<form action="<%=path%>/student/updateStudent" method="post">
		<input type="hidden" name="id" value="${stu.id}">
		<table>
			<tr>
				<td>姓名:</td>
				<td><input type="text" name="name" value="${stu.name }"></td>
			</tr>
			<tr>
				<td>学号:</td>
				<td><input type="text" name="sno" value="${stu.sno }"></td>
			</tr>
			<tr>
				<td>地址:</td>
				<td><input type="text" name="addr" value="${stu.addr }"></td>
			</tr>
			<tr>
				<td>性别:</td>
				<td><select name="sex">
						<option value="男" <c:if test="${stu.sex eq '男'}">selected</c:if>>男</option>
						<option value="女" <c:if test="${stu.sex eq '女'}">selected</c:if>>女</option>
				</select></td>
			</tr>
			<tr>
				<td>学校:</td>
				<td><input type="text" name="school_id"
					value="${stu.school_id }"></td>
			</tr>
			<tr>
				<td>学历:</td>
				<td><select name="edu">
						<option value="小学" <c:if test="${stu.edu eq '小学'}">selected</c:if>>小学</option>
						<option value="初中" <c:if test="${stu.edu eq '初中'}">selected</c:if>>初中</option>
						<option value="高中" <c:if test="${stu.edu eq '高中'}">selected</c:if>>高中</option>
						<option value="大专" <c:if test="${stu.edu eq '大专'}">selected</c:if>>大专</option>
						<option value="本科" <c:if test="${stu.edu eq '本科'}">selected</c:if>>本科</option>
						<option value="硕士" <c:if test="${stu.edu eq '硕士'}">selected</c:if>>硕士</option>
						<option value="博士" <c:if test="${stu.edu eq '博士'}">selected</c:if>>博士</option>
				</select></td>
			</tr>
			<tr>
				<td>电话:</td>
				<td><input type="text" name="tel" value="${stu.tel }"></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>