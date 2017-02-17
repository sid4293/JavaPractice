package spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeWorldController {
	@RequestMapping("/welcome.html")
	public ModelAndView helloWorld()
{
	String message="WELCOME People";
	return new ModelAndView("welcomepage","message",message);
}
}
