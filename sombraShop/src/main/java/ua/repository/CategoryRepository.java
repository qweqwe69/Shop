package ua.repository;

import org.springframework.data.repository.CrudRepository;

import ua.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
