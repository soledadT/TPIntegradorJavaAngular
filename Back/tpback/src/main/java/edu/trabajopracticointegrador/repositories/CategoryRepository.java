package edu.trabajopracticointegrador.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.trabajopracticointegrador.entities.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{

}
