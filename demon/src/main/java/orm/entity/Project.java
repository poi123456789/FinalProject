package orm.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ManyToMany;

public class Project {
	
	private String id;
	
	private String name;
	
	private String description;
	
	private String mentor;
	
	private Set<Student> students=new HashSet<Student>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMentor() {
		return mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	 @ManyToMany(mappedBy="projects")
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}
