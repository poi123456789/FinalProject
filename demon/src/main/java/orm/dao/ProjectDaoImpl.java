package orm.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import orm.entity.Project;
import orm.entity.Student;

@Repository(value = "projectDao")
public class ProjectDaoImpl implements  ProjectDao{
	
	@Resource(name = "sessionFactory")
	private SessionFactory sf;

	public Project findProjectById(String id) {
		
		return (Project) sf.getCurrentSession().createQuery("from Project where id = '" + id + "'").list().get(0);
	}

	public List<Project> findAllProject() {
		 
		return sf.getCurrentSession().createQuery("from Project").list();
	}

	public void addProject(Project pro) {
		sf.getCurrentSession().save(pro);
		
	}


	public void deleteProjectById(String id) {
		Project pro = new Project();
		pro.setId(id);
		sf.getCurrentSession().delete(pro);
		
	}

}
