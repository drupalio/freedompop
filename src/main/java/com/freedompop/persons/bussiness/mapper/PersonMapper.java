package com.freedompop.persons.bussiness.mapper;

import org.springframework.stereotype.Component;

import com.freedompop.persons.bussiness.dto.PersonDtoInt;
import com.freedompop.persons.commons.Mapper;
import com.freedompop.persons.facade.dto.PersonDto;

@Component("person-mapper")
public class PersonMapper  implements Mapper<PersonDtoInt, PersonDto>{

	@Override
	public PersonDtoInt mapToInner(PersonDto outter) {
		PersonDtoInt inner=null;
		if(outter!=null) {
			inner=new PersonDtoInt();
			inner.setId(outter.getId());
			inner.setAddress(outter.getAddress());
			inner.setEmail(outter.getEmail());
			inner.setLastname(outter.getLastname());
			inner.setName(outter.getName());
			inner.setPhonenumber(outter.getPhonenumber());
		}
		return inner;
	}

	@Override
	public PersonDto mapToOutter(PersonDtoInt inner) {
		PersonDto outter=null;
		if(inner!=null) {
			outter=new PersonDto();
			outter.setId(inner.getId());
			outter.setAddress(inner.getAddress());
			outter.setEmail(inner.getEmail());
			outter.setLastname(inner.getLastname());
			outter.setName(inner.getName());
			outter.setPhonenumber(inner.getPhonenumber());
		}
		return outter;
	}

}
