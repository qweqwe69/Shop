package ua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.SubCategory;
import ua.repository.SubCategoryRepository;

@Service
public class SubCategoryService {
	
	@Autowired
	private SubCategoryRepository subCategoryRepository;
	
	public Iterable<SubCategory> getAll() {
		return subCategoryRepository.findAll();
	}
	
	@Transactional
	public void save(String subCategoryName) {
		SubCategory subCategory = new SubCategory();
		subCategory.setSubCategoryName(subCategoryName);
		subCategoryRepository.save(subCategory);
		
	}
	
	public void delete(int id){
		subCategoryRepository.delete(id);
	}
	
	public SubCategory findOne(int id){
		return subCategoryRepository.findOne(id);
	}
}
