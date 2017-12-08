package orm.service;

import java.util.List;

import orm.entity.Project;

public interface ProjectService {
	
	public Project findProjectById(String id);

	public List<Project> findAllProject();

	public void addProject(Project pro);


	public void deleteProjectById(String id);

}
