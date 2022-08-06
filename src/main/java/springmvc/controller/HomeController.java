package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String home(Model model)
	{
		System.out.println("this is home url");
		
		model.addAttribute("name" , "Sourabh");
		
//		List<String> friends=new ArrayList<String>();
//	    friends.add("rahul");
//	    friends.add("ravi");
//	    friends.add("sourabh");
//	    model.addAttribute("f",friends);
//		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about controller");
		return "about";
	}
	
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("this is help controller");
		
		ModelAndView modelAndView= new ModelAndView();
		
		modelAndView.addObject("name","sourabh");
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(12);
		list.add(3456);
		list.add(57755);
		list.add(84975);
		modelAndView.addObject("marks",list);
		
		
		
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
}
