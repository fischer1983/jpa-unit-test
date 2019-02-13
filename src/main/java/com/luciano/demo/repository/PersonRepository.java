package com.luciano.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luciano.demo.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>  {

}
