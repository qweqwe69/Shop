package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.editor.CityEditor;
import ua.entity.City;
import ua.entity.User;
import ua.service.CityService;
import ua.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CityService cityService;
	
	@InitBinder
	protected void initbinderCityAndFirstName(WebDataBinder binder){
		binder.registerCustomEditor(City.class, new CityEditor(cityService));
	}
	
	@RequestMapping("/user")
	public String qweqwe(Model model){
		model.addAttribute("user", new User());
		model.addAttribute("users", userService.getAll());
		model.addAttribute("cities", cityService.getAll());
		return "user";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
 	public String save(@ModelAttribute User user){
		userService.save(user);
		return "redirect:/user";
	}
	

	@RequestMapping("user/{id}")
	public String delete(@PathVariable String id) {
		try {
			int ids = Integer.parseInt(id);
			userService.delete(ids);
			return "redirect:/showUsers";
		} catch (NumberFormatException e) {
		}
		return "redirect:/showUsers";
	}
}
