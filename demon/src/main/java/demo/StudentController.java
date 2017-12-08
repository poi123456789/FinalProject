package demo;


import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import orm.entity.Student;
import orm.service.StudentService;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

	@Resource(name = "studentService")
	private StudentService studentService;

	@RequestMapping(value = "/findStudentById")
	public String findStudentById(String id) {
		Student stu = studentService.findStudentById(id);
		System.out.println(stu);
		return "showStudent";
	}


	@RequestMapping(value = "/showStudent")
	public String showStudent(HttpServletRequest req, String id) {
		Student stu = studentService.findStudentById(id);
		req.setAttribute("stu", stu);
		return "showStudent";
	}

	@RequestMapping(value = "/addStudentUI")
	public String addStudentUI() {
		return "addStudent";
	}

	@RequestMapping(value = "/addStudent")
	public String addStudent(Student stu) {
		studentService.addStudent(stu);
		System.out.println(stu);
		// 重定向
		return "redirect:/student/findAllStudent";
	}

	@RequestMapping(value = "/deleteStudentById")
	public String deleteStudentById(String id) {
		studentService.deleteStudentById(id);

		// 重定向
		return "redirect:/student/findAllStudent";
	}

	// 批量删除
	@RequestMapping(value = "/deleteStudentByIds")
	public String deleteStudentByIds(String ids) {
		ids = ids.substring(0, ids.length() - 1);
		String[] idss = ids.split(",");
		for (String id : idss) {
			studentService.deleteStudentById(id);
		}
		// 重定向
		return "redirect:/student/findAllStudent";
	}

	@RequestMapping(value = "/findAllStudent")
	public String findAllStudent(HttpServletRequest req) {
		List<Student> students = studentService.findAllStudent();
		req.setAttribute("students", students);
		return "studentList";
	}

	@RequestMapping(value = "/updateStudentUI")
	public String updateStudentUI(HttpServletRequest req, String id) {
		Student stu = studentService.findStudentById(id);
		req.setAttribute("stu", stu);
		return "updateStudent";
	}

	@RequestMapping(value = "/updateStudent")
	public String updateStudent(Student stu) {
		studentService.updateStudent(stu);
		// 重定向
		return "redirect:/student/findAllStudent";
	}

}
