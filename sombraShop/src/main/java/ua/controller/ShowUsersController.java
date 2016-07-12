package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.service.ShowUsersService;
import ua.service.UserService;

@Controller
public class ShowUsersController {
	
	@Autowired
	private ShowUsersService showUsersService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/showUsers")
	public String showEditUserPageAndAllUsers(Model model) {
		model.addAttribute("users", userService.getAll());
		return "showUsers";
	}
	
	@RequestMapping("ban/{id}")
	public String banUser(@PathVariable String id) {
		try {
			int ids = Integer.parseInt(id);
			showUsersService.banUser(ids);
			return "redirect:/showUsers";
		} catch (NumberFormatException e) {
		}
		return "redirect:/showUsers";
	}
	
	@RequestMapping("unban/{id}")
	public String unbanUser(@PathVariable String id) {
		try {
			int ids = Integer.parseInt(id);
			showUsersService.unbanUser(ids);
			return "redirect:/showUsers";
		} catch (NumberFormatException e) {
		}
		return "redirect:/showUsers";
	}
}
