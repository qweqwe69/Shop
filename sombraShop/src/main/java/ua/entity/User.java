package ua.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	private City cities;

	@Enumerated(EnumType.STRING)
	private Sex sex;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@NotNull
	@Size(min=3, max=20,message="Your full name must be between 3 and 20 characters long.")
	private String firstName;
	
	@NotNull
	@Size(min=3, max=20, message="Your full name must be between 3 and 20 characters long.")
	private String lastName;
	
	private String email;
	
	private String password;
	
	private String phone;
	
	private boolean ban;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Product> cart;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public City getCities() {
		return cities;
	}

	public void setCities(City cities) {
		this.cities = cities;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isBan() {
		return ban;
	}

	public void setBan(boolean ban) {
		this.ban = ban;
	}

	public List<Product> getCart() {
		return cart;
	}

	public void setCart(List<Product> cart) {
		this.cart = cart;
	}
	
}
