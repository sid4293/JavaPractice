package spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Login.spring")
public class LoginController {
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView processCridentials(@RequestParam("userName")String userName,@RequestParam("password")String password)
	{
		String message="Invalid Credentials";
		if(!userName.equals("") && !password.equals(""))
		{
			if(userName.equals(password))
			{
				message="Welcome " + userName +"!!"; 
			}
		}
		return new ModelAndView("result","message",message);
	}

}
