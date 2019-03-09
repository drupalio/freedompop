package com.freedompop.persons.bussiness.mapper;

import org.springframework.stereotype.Component;

import com.freedompop.persons.bussiness.dto.ResponseDtoInt;
import com.freedompop.persons.commons.Mapper;
import com.freedompop.persons.facade.dto.ResponseDto;

@Component("response-mapper")
public class ResponseMapper  implements Mapper<ResponseDtoInt, ResponseDto>{

	@Override
	public ResponseDtoInt mapToInner(ResponseDto outter) {
		ResponseDtoInt  inner=null;
		if(outter!=null) {
			inner=new ResponseDtoInt();
			inner.setResponseCode(outter.getResponseCode());
		}
		return inner;
	}

	@Override
	public ResponseDto mapToOutter(ResponseDtoInt inner) {
		ResponseDto outter=null;
		if(inner!=null) {
			outter=new ResponseDto();
			outter.setResponseCode(inner.getResponseCode());
		}
		return outter;
	}

}
