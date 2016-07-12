package ua.repository;

import org.springframework.data.repository.CrudRepository;

import ua.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
