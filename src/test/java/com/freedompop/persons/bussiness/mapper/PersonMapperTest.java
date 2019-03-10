package com.freedompop.persons.bussiness.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.freedompop.persons.bussiness.dto.PersonDtoInt;
import com.freedompop.persons.facade.dto.PersonDto;

@RunWith(MockitoJUnitRunner.Silent.class)
public class PersonMapperTest {
	
	@InjectMocks
	private PersonMapper personMapper;

	@Test
	public void mapToInner() {
		PersonDto outter=new PersonDto(1, "richard", "walls", "65656565665", "demo@demo.com", "an place near the heaven");
		PersonDtoInt inner=personMapper.mapToInner(outter);
		assertNotNull(inner);
		assertEquals(inner.getEmail(), outter.getEmail());
		assertEquals(inner.getLastname(), outter.getLastname());
		assertEquals(inner.getName(), outter.getName());
		assertEquals(inner.getPhonenumber(), outter.getPhonenumber());
	}

	@Test
	public void mapToInnerNull() {
		PersonDtoInt inner=personMapper.mapToInner(null);
		assertNull(inner);
	}

	
	@Test
	public void mapToOutter() {
		PersonDtoInt inner=new PersonDtoInt(1, "richard", "walls", "65656565665", "demo@demo.com", "an place near the heaven");
		PersonDto outter=personMapper.mapToOutter(inner);
		assertNotNull(inner);
		assertEquals(inner.getEmail(), outter.getEmail());
		assertEquals(inner.getLastname(), outter.getLastname());
		assertEquals(inner.getName(), outter.getName());
		assertEquals(inner.getPhonenumber(), outter.getPhonenumber());
	}
	
	@Test
	public void mapToOutterNull() {
		PersonDto outter=personMapper.mapToOutter(null);
		assertNull(outter);
	}
	
}
