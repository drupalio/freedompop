package com.freedompop.persons.bussiness.mapper;

import com.freedompop.persons.bussiness.dto.PersonDtoInt;
import com.freedompop.persons.commons.Mapper;
import com.freedompop.persons.facade.dto.PersonDto;

public class PersonMapper  implements Mapper<PersonDtoInt, PersonDto>{

	@Override
	public PersonDtoInt mapToInner(PersonDto outter) {
		PersonDtoInt inner=null;
		if(outter!=null) {
			inner=new PersonDtoInt();
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
			outter.setAddress(inner.getAddress());
			outter.setEmail(inner.getEmail());
			outter.setLastname(inner.getLastname());
			outter.setName(inner.getName());
			outter.setPhonenumber(inner.getPhonenumber());
		}
		return outter;
	}

}
