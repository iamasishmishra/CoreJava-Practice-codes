package org.jsp.usermvcapp.controller;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@Autowired
	private EntityManager entityManager;
	
	@ResponseBody
	@RequestMapping(value="/test")
	public String test() {
		return entityManager.toString();
	}
}
