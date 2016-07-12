package ua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.Category;
import ua.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Iterable<Category> getAll() {
		return categoryRepository.findAll();
	}
	
	@Transactional
	public void save(String categoryName) {
		Category category = new Category();
		category.setCategoryName(categoryName);
		categoryRepository.save(category);
		
	}
	
	public void delete(int id){
		categoryRepository.delete(id);
	}
	
	public Category findOne(int id){
		return categoryRepository.findOne(id);
	}
}
