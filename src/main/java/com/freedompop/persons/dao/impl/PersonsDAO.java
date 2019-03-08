package com.freedompop.persons.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.freedompop.persons.dao.IPersonsDAO;

@Repository("personsDAO")
@Transactional
public class PersonsDAO implements IPersonsDAO {

	@Autowired
	DataSource dataSource;


}
