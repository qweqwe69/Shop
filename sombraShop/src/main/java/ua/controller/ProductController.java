package ua.controller;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ua.editor.CountryEditor;
import ua.editor.ManufacturerEditor;
import ua.editor.SubCategoryEditor;
import ua.entity.Country;
import ua.entity.Manufacturer;
import ua.entity.Product;
import ua.entity.SubCategory;
import ua.service.CountryService;
import ua.service.ManufacturerService;
import ua.service.ProductService;
import ua.service.SubCategoryService;

@Controller
public class ProductController {
	
	@Autowired
	private ManufacturerService manufacturerService;
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private SubCategoryService subCategoryService;
	
	@Autowired
	private ProductService productService;
	
	@InitBinder
	protected void initbinderManufacturerCountrySubCategory(WebDataBinder binder){
		binder.registerCustomEditor(Manufacturer.class, new ManufacturerEditor(manufacturerService));
		binder.registerCustomEditor(Country.class, new CountryEditor(countryService));
		binder.registerCustomEditor(SubCategory.class, new SubCategoryEditor(subCategoryService));
	}
	
	@RequestMapping("/product")
	public String qweqwe(Model model){
		model.addAttribute("product", new Product());
		model.addAttribute("manufacturers", manufacturerService.getAll());
		model.addAttribute("countries", countryService.getAll());
		model.addAttribute("subCategories", subCategoryService.getAll());
		model.addAttribute("products", productService.getAll());
		return "product";
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.POST)
 	public String save(@Valid @ModelAttribute Product products, BindingResult result, Model model, @RequestParam(value = "file", required = false) 
	MultipartFile multipartFile, HttpServletResponse httpServletResponse){
		if (result.hasErrors()){
			model.addAttribute("manufacturers", manufacturerService.getAll());
			model.addAttribute("countries", countryService.getAll());
			model.addAttribute("subCategories", subCategoryService.getAll());
			return "product";
		}
		productService.save(products, multipartFile);
		return "redirect:/product";
	}
	
	@RequestMapping("product/{id}")
	public String delete(@PathVariable String id) {
		try {
			int idProduct = Integer.parseInt(id);
			productService.delete(idProduct);
			return "redirect:/product";
		} catch (NumberFormatException e) {
		}
		return "redirect:/product";
	}
	
	@RequestMapping("editProduct/{id}")
	public String editUser(Model model, @PathVariable int id) {
		model.addAttribute("product", productService.findById(id));
		return "editProduct";
	}
	
	@RequestMapping(value="editProduct/{id}", method = RequestMethod.POST)
	public String saveEditUser(@PathVariable int id,
			@RequestParam(value = "price")int price, 
			@RequestParam(value = "color")String color, 
			@RequestParam(value = "dimensions") String dimensions,
			@RequestParam(value = "weight") String weight,
			@RequestParam(value = "warrantyPeriod") String warrantyPeriod,
			@RequestParam(value = "productDescription") String productDescription,
			@RequestParam(value = "productName") String productName, 
			@RequestParam(value = "file", required = false) 
	MultipartFile multipartFile, HttpServletResponse httpServletResponse){
		productService.editProduct(id, price, color, dimensions, weight, warrantyPeriod, productDescription, productName, multipartFile);
		return "redirect:/showUsers";
	}
	
}
