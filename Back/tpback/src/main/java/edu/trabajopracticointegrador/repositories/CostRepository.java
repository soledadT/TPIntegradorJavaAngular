package edu.trabajopracticointegrador.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.trabajopracticointegrador.entities.Cost;

@Repository
public interface CostRepository extends CrudRepository <Cost, Integer>{

}
