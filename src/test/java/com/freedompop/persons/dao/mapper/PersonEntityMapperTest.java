package com.freedompop.persons.dao.mapper;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.freedompop.persons.bussiness.dto.PersonDtoInt;
import com.freedompop.persons.entities.PersonEntity;

@RunWith(MockitoJUnitRunner.Silent.class)
public class PersonEntityMapperTest {
	@InjectMocks 
	private PersonEntityMapper personEntityMapper;
	
	
	@Test
	public void mapToInner() {
		PersonDtoInt outter =new PersonDtoInt(1, "Richard", "Walls", "767767766", "demo@demo.com", "someware|mexico|9|8|445533");
		PersonEntity inner=personEntityMapper.mapToInner(outter);
		assertNotNull(inner);
		assertEquals(inner.getEmail(), outter.getEmail());
		assertEquals(inner.getLastname(), outter.getLastname());
		assertEquals(inner.getName(), outter.getName());
		assertEquals(inner.getPhonenumber(), outter.getPhonenumber());
	}

	@Test
	public void mapToInnerNull() {
		PersonEntity inner=personEntityMapper.mapToInner(null);
		assertNull(inner);
	}

	
	@Test
	public void mapToOutter() {
		PersonEntity inner=new PersonEntity(1,"richard","walls","79978899","demo@demo.com");
		PersonDtoInt outter=personEntityMapper.mapToOutter(inner);
		assertNotNull(inner);
		assertEquals(inner.getEmail(), outter.getEmail());
		assertEquals(inner.getLastname(), outter.getLastname());
		assertEquals(inner.getName(), outter.getName());
		assertEquals(inner.getPhonenumber(), outter.getPhonenumber());
	}
	
	@Test
	public void mapToOutterNull() {
		PersonDtoInt outer=personEntityMapper.mapToOutter(null);
		assertNull(outer);
	}
	
}
