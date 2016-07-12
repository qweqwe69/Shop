package ua.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Manufacturer manufacturer;
	
	@ManyToOne
	private Country country;
	
	@ManyToOne
	private SubCategory subCategory;
	
	@ManyToOne
	private Category category;
	
	private int price;
	
	private String color;
	
	private String dimensions;
	
	private String weight;
	
	private String warrantyPeriod;
	
	private String productDescription;
	
	private String orgNamePic;
	
	private String productName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(String warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public String getOrgNamePic() {
		return orgNamePic;
	}

	public void setOrgNamePic(String orgNamePic) {
		this.orgNamePic = orgNamePic;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}
