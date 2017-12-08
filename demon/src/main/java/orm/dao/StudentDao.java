package orm.dao;

import java.util.List;

import orm.entity.Student;

public interface StudentDao {

	public Student findStudentById(String id);

	public List<Student> findAllStudent();

	public void addStudent(Student stu);

	public void updateStudent(Student stu);

	public void deleteStudentById(String id);
}