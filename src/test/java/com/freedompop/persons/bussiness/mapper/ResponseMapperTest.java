package com.freedompop.persons.bussiness.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.freedompop.persons.bussiness.dto.ResponseDtoInt;
import com.freedompop.persons.facade.dto.ResponseDto;

@RunWith(MockitoJUnitRunner.Silent.class)
public class ResponseMapperTest {
	
	@InjectMocks
	private ResponseMapper responseMapper;

	@Test
	public void mapToInner() {
		ResponseDto outer=new ResponseDto("response");
		ResponseDtoInt inner=responseMapper.mapToInner(outer);
		assertNotNull(inner);
		assertEquals(inner.getResponseCode(), outer.getResponseCode());
	}

	@Test
	public void mapToInnerNull() {
		ResponseDtoInt inner=responseMapper.mapToInner(null);
		assertNull(inner);
	}

	
	@Test
	public void mapToOutter() {
		ResponseDtoInt inner=new ResponseDtoInt("response");
		ResponseDto outer=responseMapper.mapToOutter(inner);
		assertNotNull(outer);
		assertEquals(inner.getResponseCode(), outer.getResponseCode());
	}
	
	@Test
	public void mapToOutterNull() {
		ResponseDto outer=responseMapper.mapToOutter(null);
		assertNull(outer);
	}
	
}
