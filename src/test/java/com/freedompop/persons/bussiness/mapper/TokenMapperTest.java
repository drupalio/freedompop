package com.freedompop.persons.bussiness.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.freedompop.persons.bussiness.dto.TokenDtoInt;
import com.freedompop.persons.facade.dto.TokenDto;

@RunWith(MockitoJUnitRunner.Silent.class)
public class TokenMapperTest {

	@InjectMocks
	private TokenMapper tokenMapper;
	

	@Test
	public void mapToInner() {
		TokenDto outer=new TokenDto("untoken");
		TokenDtoInt inner=tokenMapper.mapToInner(outer);
		assertEquals(outer.getToken(), inner.getToken());
	}

	@Test
	public void mapToInnerNull() {
		TokenDto outter=null;
		TokenDtoInt inner=tokenMapper.mapToInner(outter);
		assertNull(inner);
	}

	
	@Test
	public void mapToOutter() {
		TokenDtoInt inner=new TokenDtoInt("untoken");
		TokenDto outer=tokenMapper.mapToOutter(inner);
		assertNotNull(outer);
		assertEquals(outer.getToken(), inner.getToken());
	}
	
	@Test
	public void mapToOutterNull() {
		TokenDtoInt inner=null;
		TokenDto outer=tokenMapper.mapToOutter(inner);
		assertNull(outer);
	}
	
}
