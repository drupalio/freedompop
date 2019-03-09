package com.freedompop.persons.dao.mapper;

import org.springframework.stereotype.Component;

import com.freedompop.persons.bussiness.dto.PersonDtoInt;
import com.freedompop.persons.commons.Mapper;
import com.freedompop.persons.entities.PersonEntity;

@Component("person-entity-mapper")
public class PersonEntityMapper  implements Mapper<PersonEntity, PersonDtoInt>{

	@Override
	public PersonEntity mapToInner(PersonDtoInt outter) {
		PersonEntity personEntity=null;
		if(outter!=null) {
			personEntity=new PersonEntity();
			personEntity.setEmail(outter.getEmail());
			personEntity.setLastname(outter.getLastname());
			personEntity.setName(outter.getName());
			personEntity.setPhonenumber(outter.getPhonenumber());
		}
		return personEntity;
	}

	@Override
	public PersonDtoInt mapToOutter(PersonEntity inner) {
		PersonDtoInt outter=null;
		if(inner!=null) {
			outter=new PersonDtoInt();
			outter.setId(inner.getId());
			outter.setEmail(inner.getEmail());
			outter.setLastname(inner.getLastname());
			outter.setName(inner.getName());
			outter.setPhonenumber(inner.getPhonenumber());
		}
		return outter;
	}

}
