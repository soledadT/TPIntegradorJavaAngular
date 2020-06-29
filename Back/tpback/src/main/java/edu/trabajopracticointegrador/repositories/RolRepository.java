package edu.trabajopracticointegrador.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.trabajopracticointegrador.entities.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol,Integer>{

}
