package ua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.entity.Manufacturer;
import ua.repository.ManufacturerRepository;

@Service
public class ManufacturerService {
	
	@Autowired
	private ManufacturerRepository manufacturerRepository;
	
	public Iterable<Manufacturer> getAll() {
		return manufacturerRepository.findAll();
	}
	
	@Transactional
	public void save(String manufacturerName) {
		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setManufacturerName(manufacturerName);
		manufacturerRepository.save(manufacturer);
		
	}
	
	public void delete(int id){
		manufacturerRepository.delete(id);
	}
	
	public Manufacturer findOne(int id){
		return manufacturerRepository.findOne(id);
	}
	
}
