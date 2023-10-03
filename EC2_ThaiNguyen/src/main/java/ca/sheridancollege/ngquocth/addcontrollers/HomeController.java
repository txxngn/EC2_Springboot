package ca.sheridancollege.ngquocth.addcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String Root(){
		return "Root.html";
	}
	
	@GetMapping("/Name")
	public String name(){
		return "Name.html";
	}
	
	@GetMapping("/Program")
	public String program(){
		return "Program.html";
	}
	
	@GetMapping("/School")
	public String School(){
		return "School.html";
	}
	
}
