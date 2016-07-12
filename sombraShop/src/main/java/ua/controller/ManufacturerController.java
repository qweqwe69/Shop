package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.ManufacturerService;

@Controller
public class ManufacturerController {
	
	@Autowired
	private ManufacturerService manufacturerService;
	
	@RequestMapping("/manufacturer")
	public String admin(Model model) {
		model.addAttribute("manufacturers", manufacturerService.getAll());
		return "manufacturer";
	}
	
	@RequestMapping(value = "/manufacturer", method = RequestMethod.POST)
	public String save(@RequestParam(value = "manufacturerName") String manufacturerName){
		manufacturerService.save(manufacturerName);
		return "redirect:/manufacturer";
	}
	
	@RequestMapping("manufacturer/{id}")
	public String delete(@PathVariable String id) {
		try {
			int ids = Integer.parseInt(id);
			manufacturerService.delete(ids);
			return "redirect:/manufacturer";
		} catch (NumberFormatException e) {
		}
		return "redirect:/manufacturer";
	}

}
