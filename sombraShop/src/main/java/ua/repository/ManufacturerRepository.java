package ua.repository;

import org.springframework.data.repository.CrudRepository;

import ua.entity.Manufacturer;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, Integer> {

}
