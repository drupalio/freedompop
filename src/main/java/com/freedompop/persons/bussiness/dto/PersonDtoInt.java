package com.freedompop.persons.bussiness.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor 
public class PersonDtoInt {
	@Getter @Setter
	private Integer id;
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String lastname;
	@Getter @Setter
	private String phonenumber;
	@Getter @Setter
	private String email;
	@Getter @Setter
	private String address;
}
