package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.SubCategoryService;

@Controller
public class SubCategoryController {
	
	@Autowired
	private SubCategoryService subCategoryService;
	
	@RequestMapping("/subCategory")
	public String admin(Model model) {
		model.addAttribute("subCategories", subCategoryService.getAll());
		return "subCategory";
	}
	
	@RequestMapping(value = "/subCategory", method = RequestMethod.POST)
	public String save(@RequestParam(value = "subCategoryName") String subCategoryName){
		subCategoryService.save(subCategoryName);
		return "redirect:/subCategory";
	}
	
	@RequestMapping("subCategory/{id}")
	public String delete(@PathVariable String id) {
		try {
			int ids = Integer.parseInt(id);
			subCategoryService.delete(ids);
			return "redirect:/subCategory";
		} catch (NumberFormatException e) {
		}
		return "redirect:/subCategory";
	}
}
