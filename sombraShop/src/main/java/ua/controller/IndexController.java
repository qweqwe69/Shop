package ua.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.service.ProductService;

@Controller
public class IndexController {
	
	@Autowired
	private HttpServletRequest httpServletRequest;
	
	@Autowired
	private ProductService productService;

	@RequestMapping("/")
	public String showIndexPage(Model model) {
		model.addAttribute("products", productService.getAll());
		return "index";
	}
	
	@RequestMapping("/{id}")
	public String showProductPage(Model model, @PathVariable int id) {
		model.addAttribute("product", productService.findById(id));
		return "productPage";
	}
	
	@RequestMapping("/logout")
	public String logout() throws ServletException {
		httpServletRequest.logout();
		return "redirect:/";
	}

}
