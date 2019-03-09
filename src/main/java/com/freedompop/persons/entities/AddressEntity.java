package com.freedompop.persons.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idaddress")
	@Getter
	@Setter
	private int id;
	
	@Getter @Setter
	private String street;
	@Getter @Setter
	private String distric;
	@Getter @Setter
	private String city;
	@Getter @Setter
	private String postalcode;
	@Getter @Setter
	private String extnum;
	@Getter @Setter
	private String intnum;
	@Getter @Setter
	private String idperson;
}
