package demo;


import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import orm.entity.Project;
import orm.service.ProjectService;

@Controller
@RequestMapping(value = "/project")
public class ProjectController {

	@Resource(name = "projectService")
	private ProjectService projectService;

	@RequestMapping(value = "/findProjectById")
	public String findProjectById(String id) {
		Project pro = projectService.findProjectById(id);
		System.out.println(pro);
		return "showProject";
	}


	@RequestMapping(value = "/showProject")
	public String showProject(HttpServletRequest req, String id) {
		Project pro = projectService.findProjectById(id);
		req.setAttribute("pro", pro);
		return "showProject";
	}

	@RequestMapping(value = "/addProjectUI")
	public String addProjectUI() {
		return "addProject";
	}

	@RequestMapping(value = "/addProject")
	public String addProject(Project stu) {
		projectService.addProject(stu);
		System.out.println(stu);
		// 重定向
		return "redirect:/project/findAllProject";
	}

	@RequestMapping(value = "/deleteProjectById")
	public String deleteProjectById(String id) {
		projectService.deleteProjectById(id);

		// 重定向
		return "redirect:/project/findAllProject";
	}

	

	@RequestMapping(value = "/findAllProject")
	public String findAllProject(HttpServletRequest req) {
		List<Project> Projects = projectService.findAllProject();
		req.setAttribute("Projects", Projects);
		return "ProjectList";
	}



	

}
