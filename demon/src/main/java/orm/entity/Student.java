package orm.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;


public class Student {

	
	private String id;

	private String name;
	private String addr;
	private String gender;

	private String tel;
	
	private Set<Project> projects=new HashSet<Project>();

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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	@ManyToMany
    @JoinTable(name="stu_project",joinColumns={@JoinColumn(name="studentid")},inverseJoinColumns={@JoinColumn(name="projectid")})
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	
}