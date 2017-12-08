package demo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import orm.service.StudentService;


@Controller
public class GreetingController {

	 @Resource(name = "studentService")  
	    private StudentService studentService;  

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);

		studentService.findAllStudent();
		return "greeting";
	}

}
