package orm.dao;


import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import orm.entity.Student;

@Repository(value = "studentDao")
public class StudentDaoImpl implements StudentDao {

	@Resource(name = "sessionFactory")
	private SessionFactory sf;

	public Student findStudentById(String id) {
		return (Student) sf.getCurrentSession().createQuery("from Student where id = '" + id + "'").list().get(0);
	}



	@SuppressWarnings("unchecked")
	public List<Student> findAllStudent() {
		return sf.getCurrentSession().createQuery("from Student").list();
	}

	

	public void addStudent(Student stu) {
		sf.getCurrentSession().save(stu);
	}

	public void deleteStudentById(String id) {
		Student stu = new Student();
		stu.setId(id);
		sf.getCurrentSession().delete(stu);
	}

	public void updateStudent(Student stu) {
		sf.getCurrentSession().update(stu);
	}

}
