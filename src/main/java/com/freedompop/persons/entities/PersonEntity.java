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
@Table(name="persons")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idperson")
	@Getter
	@Setter
	private int id;
	
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String lastname;
	@Getter @Setter
	private String phonenumber;
	@Getter @Setter
	private String email;

}
