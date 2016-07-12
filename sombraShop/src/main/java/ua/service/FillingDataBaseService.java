package ua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ua.entity.Category;
import ua.entity.City;
import ua.entity.Country;
import ua.entity.Manufacturer;
import ua.entity.Product;
import ua.entity.Role;
import ua.entity.Sex;
import ua.entity.SubCategory;
import ua.entity.User;
import ua.repository.CategoryRepository;
import ua.repository.CityRepository;
import ua.repository.CountryRepository;
import ua.repository.ManufacturerRepository;
import ua.repository.ProductRepository;
import ua.repository.SubCategoryRepository;
import ua.repository.UserRepository;

@Service
public class FillingDataBaseService {
	
	@Autowired
	private ManufacturerRepository manufacturerRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private SubCategoryRepository subCategoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public void fillingDB(){
		
		Manufacturer manufacturer0 = new Manufacturer();
		Manufacturer manufacturer1 = new Manufacturer();
		Manufacturer manufacturer2 = new Manufacturer();
		Manufacturer manufacturer3 = new Manufacturer();
		Manufacturer manufacturer4 = new Manufacturer();
		Manufacturer manufacturer5 = new Manufacturer();
		Manufacturer manufacturer6 = new Manufacturer();
		Manufacturer manufacturer7 = new Manufacturer();
		Manufacturer manufacturer8 = new Manufacturer();
		Manufacturer manufacturer9 = new Manufacturer();
		
		manufacturer0.setManufacturerName("Alfred Dunhill");
		manufacturer1.setManufacturerName("Bell & Ross");
		manufacturer2.setManufacturerName("Giorgio Armani");
		manufacturer3.setManufacturerName("Gustav Becker");
		manufacturer4.setManufacturerName("Hublot");
		manufacturer5.setManufacturerName("Swatch");
		manufacturer6.setManufacturerName("Tissot");
		manufacturer7.setManufacturerName("Ulysse Nardin");
		manufacturer8.setManufacturerName("Omega");
		manufacturer9.setManufacturerName("Casio");
		
		manufacturerRepository.save(manufacturer0);
		manufacturerRepository.save(manufacturer1);
		manufacturerRepository.save(manufacturer2);
		manufacturerRepository.save(manufacturer3);
		manufacturerRepository.save(manufacturer4);
		manufacturerRepository.save(manufacturer5);
		manufacturerRepository.save(manufacturer6);
		manufacturerRepository.save(manufacturer7);
		manufacturerRepository.save(manufacturer8);
		manufacturerRepository.save(manufacturer9);

		
		
		City city0 = new City();
		City city1 = new City();
		City city2 = new City();
		City city3 = new City();
		City city4 = new City();
		City city5 = new City();
		City city6 = new City();
		City city7 = new City();
		City city8 = new City();
		City city9 = new City();
		
		city0.setNameCity("Kiev");
		city1.setNameCity("Kharkiv");
		city2.setNameCity("Odesa");
		city3.setNameCity("Donetsk");
		city4.setNameCity("Zaporizhia");
		city5.setNameCity("Lviv");
		city6.setNameCity("Kryvyi Rih");
		city7.setNameCity("Mykolaiv");
		city8.setNameCity("Vinnytsia");
		city9.setNameCity("Sumy");
		
		cityRepository.save(city0);
		cityRepository.save(city1);
		cityRepository.save(city2);
		cityRepository.save(city3);
		cityRepository.save(city4);
		cityRepository.save(city5);
		cityRepository.save(city6);
		cityRepository.save(city7);
		cityRepository.save(city8);
		cityRepository.save(city9);
		
		
		
		Country country0 = new Country();
		Country country1 = new Country();
		Country country2 = new Country();
		Country country3 = new Country();
		Country country4 = new Country();
		Country country5 = new Country();
		Country country6 = new Country();
		Country country7 = new Country();
		Country country8 = new Country();
		Country country9 = new Country();
		
		country0.setCountryName("Canada");
		country1.setCountryName("Japan");
		country2.setCountryName("USA");
		country3.setCountryName("China");
		country4.setCountryName("Taiwan");
		country5.setCountryName("Germany");
		country6.setCountryName("France");
		country7.setCountryName("Italy");
		country8.setCountryName("Austria");
		country9.setCountryName("Switzerland");
		
		countryRepository.save(country0);
		countryRepository.save(country1);
		countryRepository.save(country2);
		countryRepository.save(country3);
		countryRepository.save(country4);
		countryRepository.save(country5);
		countryRepository.save(country6);
		countryRepository.save(country7);
		countryRepository.save(country8);
		countryRepository.save(country9);
		
		
		
		Category category0 = new Category();
		Category category1 = new Category();
		
		category0.setCategoryName("Men's Watches");
		category1.setCategoryName("Women's Watches");
		
		categoryRepository.save(category0);
		categoryRepository.save(category1);
		
		
		
		SubCategory subCategory0 = new SubCategory();
		SubCategory subCategory1 = new SubCategory();
		SubCategory subCategory2 = new SubCategory();
		SubCategory subCategory3 = new SubCategory();
		SubCategory subCategory4 = new SubCategory();
		SubCategory subCategory5 = new SubCategory();
		SubCategory subCategory6 = new SubCategory();
		SubCategory subCategory7 = new SubCategory();
		SubCategory subCategory8 = new SubCategory();
		SubCategory subCategory9 = new SubCategory();
		
		subCategory0.setSubCategoryName("Classic");
		subCategory1.setSubCategoryName("Fasion");
		subCategory2.setSubCategoryName("Sport");
		subCategory3.setSubCategoryName("Gold");
		subCategory4.setSubCategoryName("Mechanic");
		subCategory5.setSubCategoryName("Quartz");
		subCategory6.setSubCategoryName("Waterproof");
		subCategory7.setSubCategoryName("Electric");
		subCategory8.setSubCategoryName("Shockproof");
		subCategory9.setSubCategoryName("Kids");
		
		subCategoryRepository.save(subCategory0);
		subCategoryRepository.save(subCategory1);
		subCategoryRepository.save(subCategory2);
		subCategoryRepository.save(subCategory3);
		subCategoryRepository.save(subCategory4);
		subCategoryRepository.save(subCategory5);
		subCategoryRepository.save(subCategory6);
		subCategoryRepository.save(subCategory7);
		subCategoryRepository.save(subCategory8);
		subCategoryRepository.save(subCategory9);
		

		
		Product product0 = new Product();
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		Product product4 = new Product();
		Product product5 = new Product();
		Product product6 = new Product();
		Product product7 = new Product();
		Product product8 = new Product();
		Product product9 = new Product();
		
		product0.setCategory(category0);
		product0.setColor("Gold");
		product0.setCountry(country9);
		product0.setDimensions("blablalbla123");
		product0.setManufacturer(manufacturer7);
		product0.setOrgNamePic("Forsining-Richard-4-main.jpg");
		product0.setPrice(9000);
		product0.setProductDescription("1231436543263");
		product0.setProductName("Jedir Matrix");
		product0.setSubCategory(subCategory5);
		product0.setWarrantyPeriod("36 month");
		product0.setWeight("250g");
		
		productRepository.save(product0);
		
		product1.setCategory(category0);
		product1.setColor("Black");
		product1.setCountry(country7);
		product1.setDimensions("blab123132lalbla123");
		product1.setManufacturer(manufacturer5);
		product1.setOrgNamePic("Forsining-Rich-main.jpg");
		product1.setPrice(8500);
		product1.setProductDescription("1231436543263qweqwe");
		product1.setProductName("Forsining Richard IV");
		product1.setSubCategory(subCategory4);
		product1.setWarrantyPeriod("54 month");
		product1.setWeight("350g");
		
		productRepository.save(product1);
		
		product2.setCategory(category0);
		product2.setColor("Gold");
		product2.setCountry(country5);
		product2.setDimensions("qweblab123132lalbla123");
		product2.setManufacturer(manufacturer3);
		product2.setOrgNamePic("Jaragar-Turbullion.jpg");
		product2.setPrice(8700);
		product2.setProductDescription("125asdasdasd43263qweqwe");
		product2.setProductName("Jaragar Turboulion");
		product2.setSubCategory(subCategory4);
		product2.setWarrantyPeriod("24 month");
		product2.setWeight("250g");
		
		productRepository.save(product2);
		
		product3.setCategory(category0);
		product3.setColor("White");
		product3.setCountry(country3);
		product3.setDimensions("qweblabl2fghfghalbla123");
		product3.setManufacturer(manufacturer1);
		product3.setOrgNamePic("Megir-Luminor-VIP-1.jpg");
		product3.setPrice(1560);
		product3.setProductDescription("1d432614143qweqwe");
		product3.setProductName("Jedir Luminor VIP");
		product3.setSubCategory(subCategory0);
		product3.setWarrantyPeriod("12 month");
		product3.setWeight("250g");
		
		productRepository.save(product3);
		
		product4.setCategory(category0);
		product4.setColor("Black-Silver");
		product4.setCountry(country1);
		product4.setDimensions("qweblqwew23");
		product4.setManufacturer(manufacturer0);
		product4.setOrgNamePic("Jedir-Matrix-MAIN.jpg");
		product4.setPrice(2560);
		product4.setProductDescription("1dqweqwewe");
		product4.setProductName("Jedir Techno");
		product4.setSubCategory(subCategory3);
		product4.setWarrantyPeriod("24 month");
		product4.setWeight("270g");
		
		productRepository.save(product4);
		
		product5.setCategory(category1);
		product5.setColor("Black");
		product5.setCountry(country0);
		product5.setDimensions("qweblq123123wew23");
		product5.setManufacturer(manufacturer2);
		product5.setOrgNamePic("CL-Key-2.jpg");
		product5.setPrice(256);
		product5.setProductDescription("1dqweqwewwsgsdfgsde");
		product5.setProductName("CL Key");
		product5.setSubCategory(subCategory6);
		product5.setWarrantyPeriod("12 month");
		product5.setWeight("180g");
		
		productRepository.save(product5);
		
		product6.setCategory(category1);
		product6.setColor("Silver");
		product6.setCountry(country2);
		product6.setDimensions("qweblasdasdqwew23");
		product6.setManufacturer(manufacturer4);
		product6.setOrgNamePic("Skone-Fast-main.jpg");
		product6.setPrice(2960);
		product6.setProductDescription("1dqwsadqwezceqwewe");
		product6.setProductName("Skone Fast");
		product6.setSubCategory(subCategory5);
		product6.setWarrantyPeriod("24 month");
		product6.setWeight("200g");
		
		productRepository.save(product6);
		
		
		product7.setCategory(category1);
		product7.setColor("Flower");
		product7.setCountry(country4);
		product7.setDimensions("bl43qwew23");
		product7.setManufacturer(manufacturer6);
		product7.setOrgNamePic("Geneva-Rainbow-1.jpg");
		product7.setPrice(2060);
		product7.setProductDescription("1123132eqwewe");
		product7.setProductName("Geneva Rainbow");
		product7.setSubCategory(subCategory7);
		product7.setWarrantyPeriod("10 month");
		product7.setWeight("150g");
		
		productRepository.save(product7);
		
		
		product8.setCategory(category1);
		product8.setColor("Silver");
		product8.setCountry(country6);
		product8.setDimensions("qw1323qwe12312323");
		product8.setManufacturer(manufacturer8);
		product8.setOrgNamePic("Geneva Silver maim.jpeg");
		product8.setPrice(1560);
		product8.setProductDescription("1d123wqwe2we");
		product8.setProductName("Geneva Silver");
		product8.setSubCategory(subCategory3);
		product8.setWarrantyPeriod("24 month");
		product8.setWeight("270g");
		
		productRepository.save(product8);
		
		
		product9.setCategory(category1);
		product9.setColor("Gold");
		product9.setCountry(country8);
		product9.setDimensions("qasdasdqwew23");
		product9.setManufacturer(manufacturer9);
		product9.setOrgNamePic("Geneva Gold ma.jpg");
		product9.setPrice(2960);
		product9.setProductDescription("1dqw98097ewe");
		product9.setProductName("Geneva Gold");
		product9.setSubCategory(subCategory0);
		product9.setWarrantyPeriod("24 month");
		product9.setWeight("300g");
		
		productRepository.save(product9);
		
		User user0 = new User();
		User user1 = new User();
		User user2 = new User();
//		User user3 = new User();
//		User user4 = new User();
		
		user0.setCities(city9);
		user0.setEmail("petro@i.ua");
		user0.setFirstName("Petro");
		user0.setLastName("Petrov");
		user0.setPhone("+380631160667");
		user0.setSex(Sex.MALE);
		user0.setRole(Role.ROLE_USER);
		user0.setPassword("qweqwe");
		user0.setPassword(bCryptPasswordEncoder.encode(user0.getPassword()));
		
		userRepository.save(user0);
		
		user1.setCities(city8);
		user1.setEmail("ivan@i.ua");
		user1.setFirstName("Ivan");
		user1.setLastName("Ivanov");
		user1.setPhone("+380631160668");
		user1.setSex(Sex.MALE);
		user1.setRole(Role.ROLE_USER);
		user1.setPassword("qweqwe");
		user1.setPassword(bCryptPasswordEncoder.encode(user1.getPassword()));
		
		userRepository.save(user1);
		
		user2.setCities(city7);
		user2.setEmail("kate@i.ua");
		user2.setFirstName("Katya");
		user2.setLastName("Malnova");
		user2.setPhone("+380631160668");
		user2.setSex(Sex.FEMALE);
		user2.setRole(Role.ROLE_USER);
		user2.setPassword("qweqwe");
		user2.setPassword(bCryptPasswordEncoder.encode(user2.getPassword()));
		
		userRepository.save(user2);
		
	}
	
}
