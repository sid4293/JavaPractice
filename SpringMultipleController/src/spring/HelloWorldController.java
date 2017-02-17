package spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello.html")
	public ModelAndView helloWorld()
	{
		System.out.println("Hello");
		String message="Hello People";
		return new ModelAndView("hellopage", "message", message);
	}

}
