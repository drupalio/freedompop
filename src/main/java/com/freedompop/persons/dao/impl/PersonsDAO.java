package com.freedompop.persons.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.freedompop.persons.bussiness.dto.PersonDtoInt;
import com.freedompop.persons.bussiness.dto.ResponseDtoInt;
import com.freedompop.persons.commons.BussinesServiceException;
import com.freedompop.persons.commons.Mapper;
import com.freedompop.persons.dao.IPersonsDAO;
import com.freedompop.persons.dao.PersonRepository;
import com.freedompop.persons.entities.PersonEntity;

@Repository("personsDAO")
@Transactional
public class PersonsDAO implements IPersonsDAO {

	@Autowired
	DataSource dataSource;

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	@Qualifier("person-entity-mapper")
	private Mapper<PersonEntity, PersonDtoInt> personEntityMapper;

	@Override
	public ResponseDtoInt createPerson(PersonDtoInt person) {
		ResponseDtoInt response = new ResponseDtoInt();
		PersonEntity personEntity = personEntityMapper.mapToInner(person);
		try {
			personRepository.save(personEntity);
			response.setResponseCode("200");
		} catch (Exception e) {
			response.setResponseCode("500");
		}
		return response;
	}

	@Override
	public PersonDtoInt findPerson(PersonDtoInt person) {
		return personEntityMapper.mapToOutter(findEntityById(person.getId()));
	}

	@Override
	public ResponseDtoInt updatePerson(PersonDtoInt person) {
		ResponseDtoInt response = new ResponseDtoInt();
		PersonEntity outter = findEntityById(person.getId());
		outter.setEmail(person.getEmail());
		outter.setLastname(person.getLastname());
		outter.setName(person.getName());
		outter.setPhonenumber(person.getPhonenumber());
		personRepository.save(outter);
		response.setResponseCode("200");
		return response;

	}

	private PersonEntity findEntityById(Integer id) {
		Optional<PersonEntity> persondb = personRepository.findById(id);
		if (persondb != null && persondb.get() != null) {
			PersonEntity outter = persondb.get();
			return outter;
		}
		throw new BussinesServiceException("no existe la persona");
	}

	@Override
	public ResponseDtoInt deletePerson(PersonDtoInt person) {
		ResponseDtoInt response = new ResponseDtoInt();
		PersonEntity outter = findEntityById(person.getId());
		personRepository.delete(outter);
		response.setResponseCode("200");
		return response;

	}

	@Override
	public List<PersonDtoInt> listPersons() {
		List<PersonEntity> persons = new ArrayList<PersonEntity>();
		personRepository.findAll().iterator().forEachRemaining(persons::add);
		List<PersonDtoInt> personsout = new ArrayList<PersonDtoInt>();
		for (PersonEntity personEntity : persons) {
			personsout.add(personEntityMapper.mapToOutter(personEntity));
		}
		return personsout;
	}

}
