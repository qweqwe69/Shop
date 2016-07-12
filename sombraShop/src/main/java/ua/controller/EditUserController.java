package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.CityService;
import ua.service.EditUserService;
import ua.service.RegistrationService;
import ua.service.UserService;

@Controller
public class EditUserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private EditUserService editUserService;
	
	@Autowired
	private RegistrationService registrationService;
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping("editUser/{id}")
	public String editUser(Model model, @PathVariable int id) {
		model.addAttribute("user", userService.findById(id));
		return "edit";
	}
	
	@RequestMapping(value="editUser/{id}", method = RequestMethod.POST)
	public String saveEditUser(@PathVariable int id,
			@RequestParam(value = "firstName")String firstName, 
			@RequestParam(value = "lastName") String lastName,
			@RequestParam(value = "email") String email,
			@RequestParam(value = "phone") String phone){
		editUserService.editUser(id, firstName, lastName, email, phone);
		return "redirect:/showUsers";
	}
}
