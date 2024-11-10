package org.jsp.usermvcapp.controller;

import org.jsp.usermvcapp.dao.UserDao;
import org.jsp.usermvcapp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="/open-register")
	public ModelAndView openRegister(ModelAndView modelAndView) {
		modelAndView.setViewName("register");
		modelAndView.addObject("user",new User());
		
		return modelAndView;
	}
	
	@ResponseBody
	@PostMapping(value="/register")
	public String saveUser(@ModelAttribute(name="user") User user) {
		user = userDao.saveUser(user);
		return "User saved with Id"+ user.getId();
	}
	
	@GetMapping(value="/open-view")
	public String openView(@RequestParam String view) {
		return view;
	}
	
	public ModelAndView findById(@RequestParam(name="id") int id, ModelAndView modelAndView) {
		User user = userDao.findById(id);
		if(user!=null) {
			modelAndView.setViewName("display");
			modelAndView.addObject("user", user);
			return modelAndView;
		}
		
		modelAndView.setViewName("error");
		modelAndView.addObject("message", "Invalid User Id.");
		return modelAndView;
	}
}
