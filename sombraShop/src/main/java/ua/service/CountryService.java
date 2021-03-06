package ua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Country;
import ua.repository.CountryRepository;


@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;

	public void save(String countryName) {
		Country country = new Country();
		country.setCountryName(countryName);
		countryRepository.save(country);
	}

	public Iterable<Country> getAll() {
		return countryRepository.findAll();
	}
	
	public void delete(int id){
		countryRepository.delete(id);
	}

	public Country findOne(int id) {
		return countryRepository.findOne(id);
	}
}
