package ua.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cities")
	private List<User> users;

	private String nameCity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

}
