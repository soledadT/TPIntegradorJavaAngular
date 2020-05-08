package edu.trabajopracticointegrador.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.trabajopracticointegrador.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}
