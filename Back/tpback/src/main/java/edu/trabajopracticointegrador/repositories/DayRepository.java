package edu.trabajopracticointegrador.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.trabajopracticointegrador.entities.Day;

@Repository
public interface DayRepository extends CrudRepository<Day, Integer> {

}
