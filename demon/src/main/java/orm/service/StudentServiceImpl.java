package orm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import orm.dao.StudentDao;
import orm.entity.Student;

@org.springframework.stereotype.Service(value = "studentService")
@Transactional
public class StudentServiceImpl implements StudentService {

	@Resource(name = "studentDao")
	private StudentDao studentDao;

	public List<Student> findAllStudent() {

		return studentDao.findAllStudent();
	}

	public void addStudent(Student stu) {
		studentDao.addStudent(stu);

	}

	public void updateStudent(Student stu) {
		studentDao.updateStudent(stu);

	}

	public Student findStudentById(String id) {

		return studentDao.findStudentById(id);
	}

	public void deleteStudentById(String id) {
		
		studentDao.deleteStudentById(id);

	}

}
