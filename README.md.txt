Xu Pinwen
student ID 14217624
pawprint:px4f2

team number
xu pinwen(leader)
Tony Dong(not in classs)

demo video:http://v.youku.com/v_show/id_XMzIxNjY0Mzc5Ng==.html?spm=a2h3j.8428770.3416059.1

description :
	The web app Application provides a basic functions for education system----create ,delete update project and student,
	 according to the page tips, you can 
	1.query the project and student details
	2.add a new  student
	3.remove existed  student
	4.add a new  project
	5.remove existed  project
	6.update student information




##############################################################################################################################################################################################################################################################################################################
the table definitions are as follows: 

	Table     	column   	comment
########################################################
	student		id			student id(primary key)
				name		student's name
				addr		student's address
				gender		student's gender
				tel			student's telephone Num
########################################################
	project		id			project id(primary key)
				name		project's name
				description	project's description
				mentor		project's mentor

				
		


##############################################################################################################################################################################################################################################################################################################

explanation ：
	(C)when a new student or project is added,the server insert one data into table STUDENT or PROJECT;
	(R)when query the project and student details,the server read certain data from table STUDENT or PROJECT according to id.
	(U)when update a project or student information,the server update certain data in table STUDENT or PROJECT according to id.
	(D)when a student or project is removed,the server delete one data to table STUDENT or PROJECT;
	