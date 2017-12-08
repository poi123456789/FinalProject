package orm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import orm.dao.ProjectDao;
import orm.dao.StudentDao;
import orm.entity.Project;


@org.springframework.stereotype.Service(value = "projectService")
@Transactional
public class ProjectServiceImpl implements ProjectService {
	
	@Resource(name = "projectDao")
	private ProjectDao projectDao;

	public Project findProjectById(String id) {
		
		return projectDao.findProjectById(id);
	}

	public List<Project> findAllProject() {
	
		return projectDao.findAllProject();
	}

	public void addProject(Project pro) {
		projectDao.addProject(pro);

	}

	public void deleteProjectById(String id) {
		projectDao.deleteProjectById(id);

	}

}
