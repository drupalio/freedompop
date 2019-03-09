package com.freedompop.persons.dao;

import org.springframework.data.repository.CrudRepository;

import com.freedompop.persons.entities.TokenEntity;

public interface TokenRepository extends CrudRepository<TokenEntity,Integer> {

}
