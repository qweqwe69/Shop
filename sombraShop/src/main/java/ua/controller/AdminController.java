package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.service.FillingDataBaseService;

@Controller
public class AdminController {
	
	@Autowired
	private FillingDataBaseService fillingDataBaseService;
	
	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	@RequestMapping("/fillingDB")
	public String fillingDB() {
		fillingDataBaseService.fillingDB();
		return "redirect:/admin";
	}
	
}

