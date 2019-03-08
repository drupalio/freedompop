package com.freedompop.persons.dao;

import com.freedompop.persons.bussiness.dto.PersonDtoInt;
import com.freedompop.persons.bussiness.dto.ResponseDtoInt;

public interface IPersonsDAO {
	public ResponseDtoInt createPerson(PersonDtoInt person);
	public PersonDtoInt findPerson(PersonDtoInt person);
	public ResponseDtoInt updatePerson(PersonDtoInt person);
	public ResponseDtoInt deletePerson(PersonDtoInt person);
}
