package ua.service;

import java.security.Principal;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.Product;
import ua.entity.User;
import ua.repository.ProductRepository;
import ua.repository.UserRepository;

@Transactional
@Service
public class CartService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public List<Product> showProductInCart(Principal principal){
		User user = userRepository.findOne((Integer.parseInt(principal.getName())));
		Hibernate.initialize(user.getCart());
		List<Product> products = user.getCart();
		return products;
	}
	
	public void addProductToCart(Principal principal, int id){
		User user = userRepository.findOne((Integer.parseInt(principal.getName())));
		Product product = productRepository.findOne(id);
		user.getCart().add(product);
	}
	
	public void deleteWithCart(Principal principal, int id){
		User user = userRepository.findOne((Integer.parseInt(principal.getName())));
		Product product = productRepository.findOne(id);
		user.getCart().remove(product);
	}
}
