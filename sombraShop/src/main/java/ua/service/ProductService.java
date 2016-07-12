package ua.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ua.entity.Product;
import ua.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Iterable<Product> getAll() {
		return productRepository.findAll();
	}
	
	public Product findById(int productId){
		return productRepository.findOne(productId);
	}
	
	public void save(Product products, MultipartFile multipartFile) {
		String orgName = multipartFile.getOriginalFilename();
        String productPicPath = "E:/CODING/03.06/WORKSPACE/sombraShop/src/main/webapp/static/productPic/";
        String filePath = productPicPath + orgName;
        File dest = new File(filePath);
        try {
            multipartFile.transferTo(dest);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        products.setOrgNamePic(orgName);
		productRepository.save(products);
	}
	
	public void delete(int id){
		productRepository.delete(id);
	}
	
	public void editProduct(int id, int price, String color, String dimensions, 
			String weight, String warrantyPeriod, String productDescription, String productName, MultipartFile multipartFile){
		Product product = productRepository.findOne(id);
		product.setPrice(price);
		product.setColor(color);
		product.setDimensions(dimensions);
		product.setWeight(weight);
		product.setWarrantyPeriod(warrantyPeriod);
		product.setProductDescription(productDescription);
		product.setProductName(productName);
		
		String orgName = multipartFile.getOriginalFilename();
        String productPicPath = "E:/CODING/03.06/WORKSPACE/sombraShop/src/main/webapp/static/productPic/";
        String filePath = productPicPath + orgName;
        File dest = new File(filePath);
        try {
            multipartFile.transferTo(dest);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        product.setOrgNamePic(orgName);
		productRepository.save(product);
		
	}
}
