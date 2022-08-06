package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("Header","learncode");
		m.addAttribute("des","home for programmer");
	}
	
	
	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		
		return "contact";
	}
	
	
	@RequestMapping(path="/processform",method= RequestMethod.POST)
	public String handleform(@ModelAttribute User user,Model model)
	{
		
		System.out.println(user);
		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg","User created with id"+createdUser );
		//model.addAttribute("user",user);
		return "success";
	}
	
}



//@RequestMapping(path="/processform",method= RequestMethod.POST)
//public String handleform(@RequestParam(name="email" , required = true) String userEmail ,
//		@RequestParam("userName") String userName ,
//		@RequestParam("password") String userPassword , Model model)
//{
//	
//	User user=new User();
//	user.setEmail(userEmail);
//	user.setUserName(userName);
//	user.setPassword(userPassword);
//	
//	System.out.println(user);
//	
//	//process
////	
////	model.addAttribute("name",userName);
////	model.addAttribute("email",userEmail);
////	model.addAttribute("password",userPassword);
//	
//	model.addAttribute("user",user);
//	return "success";
//}
