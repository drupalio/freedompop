package com.freedompop.persons.facade.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor 
public class PersonDto {
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
