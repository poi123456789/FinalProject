<pre class="html" name="code">
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page isELIgnored="false" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://"
    + request.getServerName() + ":" + request.getServerPort()
    + path + "/";
 %>
<html>
<head>
<title>studentList.jsp</title>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
   function reset(){
		$('input[name=school]').val('');
	}
   function selectOrUnslect(){
     var ids = document.getElementsByName('ids');
     if(document.getElementById('topId').checked == true){
      for(var i=0;i<ids.length;i++){
        ids[i].checked = true;
       }
     }else{
      for(var i=0;i<ids.length;i++){
       ids[i].checked = false;
      }
     }
    }
    
    function deleteSomeStudent(){ 
     var ids = document.getElementsByName('ids');
     var strIds = '';
     for(var i=0;i<ids.length;i++){
      if(ids[i].checked == true){
       strIds += ids[i].value + ',';
      }
     } 
     if(strIds==''){
    	 alert("请选择要删除的记录！");
    }else{
     window.location = '<%=path%>/student/deleteStudentByIds?ids=' + strIds;} 
    }
   </script>
</head>
<body>
	<h3>StudentList</h3>
	<%-- <form action="<%=path %>/student/login" method="post">
		
		<input name="input" value="查询" type="submit" /> 
		<input name="resetSrchForm" type="button" onclick="reset()" value="重置" /> 
		<input type="button" value="批量删除" onclick="deleteSomeStudent();">
		  
	</form> --%>
	<p> <a href="<%=path %>/student/addStudentUI">add new student</a>  </p>
	<p> <a href="<%=path %>/greeting">return</a>  </p>
	<table width="100%" border="1">
		<tr>
			
			<td style="text-align: center">Name</td>
			<td style="text-align: center">Id</td>
			<td style="text-align: center">gender</td>
			
			<td style="text-align: center">tel</td>
			<td style="text-align: center">addr</td>
	
		</tr>
		<c:forEach items="${students}" var="stu">
			<tr>
				<%-- <td style="text-align: center"><input type="checkbox"
					name="ids" value="${stu.id }"></td> --%>
				<td style="text-align: center">${stu.name }</td>
				<td style="text-align: center">${stu.id }</td>
				<td style="text-align: center">${stu.gender}</td>
		
				<td style="text-align: center">${stu.tel}</td>
				<td style="text-align: center">${stu.addr}</td>
				<td style="text-align: center">
				  
					<a href="<%=path %>/student/deleteStudentById?id=${stu.id}">delete</a> 
					<a href="<%=path %>/student/showStudent?id=${stu.id}">see detail</a>
					
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>