package org.jsp.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
//	for home page
	@RequestMapping(value = "/open-home")
	public String openHomePage(Model model) {
		model.addAttribute("username", "Vk");
		return "home";
	}
	
	
//	for single output page which show all the output in single page
	@RequestMapping("/open-view")
	public String openView(@RequestParam(name="view") String view) {
		return view;
	}
	
//	for sum page
	@RequestMapping("/sum")
	public String findSum(@RequestParam(name="num1") int num1, @RequestParam(name="num2") int num2, Model model) {
		model.addAttribute("result", num1+ " + "+ num2 + " = "+ (num1+num2));
		return "print";
	}
	
//	for diff page
	@RequestMapping("/diff")
	public String findDiff(@RequestParam(name="num1") int num1, @RequestParam(name="num2") int num2, Model model) {
		model.addAttribute("result", num1+ " - "+ num2 + " = "+ (num1-num2));
		return "print";
	}
	
	
//	for mul page
	@RequestMapping("/mul")
	public String findMul(@RequestParam(name="num1") int num1, @RequestParam(name="num2") int num2, Model model) {
		model.addAttribute("result", num1+ " x "+ num2 + " = "+ (num1*num2));
		return "print";
	}
	
//	for div page
	@RequestMapping("/div")
	public String findDiv(@RequestParam(name="num1") int num1, @RequestParam(name="num2") int num2, Model model) {
		model.addAttribute("result", num1+ " / "+ num2 + " = "+ (num1/num2));
		return "print";
	}
	
//	for largest of two nos
	@RequestMapping("/largest")
	public String findLargest(@RequestParam(name="num1") int num1, @RequestParam(name="num2") int num2, Model model) {
		if(num1>num2) {
			model.addAttribute("result", num1 );
		}
		else {
			model.addAttribute("result", num2 );
		}
		return "print";
//		model.addAttribute("result",  + num1>num2? num1:  num2);
//		return "print";
	}
	
//	for smallest of two nos
	@RequestMapping("/smallest")
	public String findSmallest(@RequestParam(name="num1") int num1, @RequestParam(name="num2") int num2, Model model) {
		if(num1<num2) {
			model.addAttribute("result", num1 );
		}
		else {
			model.addAttribute("result", num2 );
		}
		return "print";
//		model.addAttribute("result",  + num1>num2? num1:  num2);
//		return "print";
	}
	
	
	
	@RequestMapping(value="/open-register")
	public ModelAndView openRegister() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("register");
		modelAndView.addObject("obj", new User());
		return modelAndView;
	}
	
	@RequestMapping(value="/register")
	@ResponseBody
	public String register(@ModelAttribute(name="obj") User user) {
		System.out.println(user);
		return "pribted Successfully...";
	}
}
