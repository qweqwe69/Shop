package ua.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.editor.CityEditor;
import ua.entity.City;
import ua.entity.User;
import ua.service.CityService;
import ua.service.RegistrationService;

@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@Autowired
	private CityService cityService;
	
	@InitBinder
	protected void initbinderCity(WebDataBinder binder){
		binder.registerCustomEditor(City.class, new CityEditor(cityService));
	}
	
	
	
	@RequestMapping("/registration")
	public String qweqwe(Model model){
		model.addAttribute("user", new User());
		model.addAttribute("cities", cityService.getAll());
		return "registration";
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
 	public String save(@Valid @ModelAttribute User user, BindingResult result, Model model){
		if (result.hasErrors()){
			model.addAttribute("cities", cityService.getAll());
			return "registration";
		}
		registrationService.save(user);
		return "redirect:/";
	}
}
