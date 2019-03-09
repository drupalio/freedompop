package com.freedompop.persons.dao;

import org.springframework.data.repository.CrudRepository;

import com.freedompop.persons.entities.PersonEntity;

public interface PersonRepository  extends CrudRepository<PersonEntity,Integer> {

}
