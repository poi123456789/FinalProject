package orm.dao;

import java.util.List;

import orm.entity.Project;

public interface ProjectDao {

	public Project findProjectById(String id);

	public List<Project> findAllProject();

	public void addProject(Project pro);


	public void deleteProjectById(String id);
}