package ua.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.service.CartService;

@Controller
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@RequestMapping("/cart")
	public String show(Model model, Principal principal) {
		model.addAttribute("products", cartService.showProductInCart(principal));
		return "cart";
	}
	
	
	@RequestMapping("addToCart/{id}")
	public String addProductToCart(Principal principal, @PathVariable int id) {
		cartService.addProductToCart(principal, id);
		return "redirect:/";
	}
	
	@RequestMapping("deleteWithCart/{id}")
	public String deleteWithCart(Principal principal, @PathVariable int id) {
		cartService.deleteWithCart(principal, id);
		return "redirect:/cart";
	}
}
