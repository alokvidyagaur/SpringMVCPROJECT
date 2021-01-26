package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
   
	@RequestMapping("/")
	public String login() {
		return "login";
	}
	@RequestMapping("/login-panel")
	public String home(UserLogin login,Model model)
	{
	//System.out.println("user-name :"+login.getUserName());
	//System.out.println("user-password :"+login.getUserPasswd());
		if(login.getUserName().contentEquals("Abhi") && login.getUserPasswd().contentEquals("789"))
		{
			System.out.println("*****Home page");
	  model.addAttribute("uname", login.getUserName());
	 model.addAttribute("upassword", login.getUserPasswd());	
	 return "home";
		}
		else
		{
			model.addAttribute("msg","Invalid!!!");
			return "login";
		}
	}
}