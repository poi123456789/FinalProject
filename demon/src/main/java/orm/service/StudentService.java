package orm.service;

import java.util.List;

import orm.entity.Student;

public interface StudentService {

	public Student findStudentById(String id);

	public List<Student> findAllStudent();

	public void addStudent(Student stu);

	public void deleteStudentById(String id);

	public void updateStudent(Student stu);

}