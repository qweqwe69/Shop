package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/category")
	public String admin(Model model) {
		model.addAttribute("categories", categoryService.getAll());
		return "category";
	}
	
	@RequestMapping(value = "/category", method = RequestMethod.POST)
	public String save(@RequestParam(value = "categoryName") String categoryName){
		categoryService.save(categoryName);
		return "redirect:/category";
	}
	
	@RequestMapping("category/{id}")
	public String delete(@PathVariable String id) {
		try {
			int ids = Integer.parseInt(id);
			categoryService.delete(ids);
			return "redirect:/category";
		} catch (NumberFormatException e) {
		}
		return "redirect:/category";
	}
}
