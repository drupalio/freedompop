package com.freedompop.persons.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.freedompop.persons.bussiness.IPersonsServiceInt;
import com.freedompop.persons.bussiness.dto.PersonDtoInt;
import com.freedompop.persons.bussiness.dto.ResponseDtoInt;
import com.freedompop.persons.commons.BussinesServiceException;
import com.freedompop.persons.commons.Mapper;
import com.freedompop.persons.facade.IPersonsService;
import com.freedompop.persons.facade.dto.PersonDto;
import com.freedompop.persons.facade.dto.ResponseDto;

@RestController
public class PersonsService implements IPersonsService {

	@Autowired
	@Qualifier("personsServiceIntImpl")
	private IPersonsServiceInt personsServiceInt;

	@Autowired
	@Qualifier("person-mapper")
	private Mapper<PersonDtoInt, PersonDto> personMapper;

	@Autowired
	@Qualifier("response-mapper")
	private Mapper<ResponseDtoInt, ResponseDto> responseMapper;

	@Override
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseDto createPerson(PersonDto person) {
		ResponseDto reponse = null;
		if (person != null) {
			reponse = new ResponseDto();
			PersonDtoInt internalPerson = personMapper.mapToInner(person);
			ResponseDtoInt internalResponse = personsServiceInt.createPerson(internalPerson);
			reponse = responseMapper.mapToOutter(internalResponse);
			return reponse;
		}
		throw new BussinesServiceException("Datos de entrada invalidos");
	}

	@Override
	@RequestMapping(value = "/find", method = RequestMethod.POST)
	public PersonDto findPerson(PersonDto person) {
		PersonDto reponse = null;
		if (person != null) {
			reponse = new PersonDto();
			PersonDtoInt internalPerson = personMapper.mapToInner(person);
			PersonDtoInt internalResponse = personsServiceInt.findPerson(internalPerson);
			reponse = personMapper.mapToOutter(internalResponse);
			return reponse;
		}
		throw new BussinesServiceException("Datos de entrada invalidos");
	}

	@Override
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseDto updatePerson(PersonDto person) {
		ResponseDto reponse = null;
		if (person != null) {
			reponse = new ResponseDto();
			PersonDtoInt internalPerson = personMapper.mapToInner(person);
			ResponseDtoInt internalResponse = personsServiceInt.updatePerson(internalPerson);
			reponse = responseMapper.mapToOutter(internalResponse);
			return reponse;
		}
		throw new BussinesServiceException("Datos de entrada invalidos");
	}

	@Override

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public ResponseDto deletePerson(PersonDto person) {
		ResponseDto reponse = null;
		if (person != null) {
			reponse = new ResponseDto();
			PersonDtoInt internalPerson = personMapper.mapToInner(person);
			ResponseDtoInt internalResponse = personsServiceInt.deletePerson(internalPerson);
			reponse = responseMapper.mapToOutter(internalResponse);
			return reponse;
		}
		throw new BussinesServiceException("Datos de entrada invalidos");
	}

	@Override
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<PersonDto> listPersons() {
		List<PersonDtoInt> internalList=personsServiceInt.listPersons();
		List<PersonDto>  outputlist=new ArrayList<PersonDto>();
		for (PersonDtoInt personDtoInt : internalList) {
			outputlist.add(personMapper.mapToOutter(personDtoInt));
		}
		return outputlist;
	}

}
