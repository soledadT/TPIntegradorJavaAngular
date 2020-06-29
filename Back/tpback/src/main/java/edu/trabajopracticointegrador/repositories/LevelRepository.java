package edu.trabajopracticointegrador.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.trabajopracticointegrador.entities.Level;

@Repository
public interface LevelRepository extends CrudRepository<Level,Integer> {

}
