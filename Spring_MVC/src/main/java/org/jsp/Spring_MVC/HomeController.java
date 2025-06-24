package org.jsp.Spring_MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/employee")
	public String employee() {
		
		return "index.html";
	}
	
	@ResponseBody
	@RequestMapping("/save")
	public String save() {
		return "Successfully added details";
	}

}
