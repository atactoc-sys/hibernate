package com.anudip.OneToManyEmployee.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Citizen 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	@Column(length = 15)
	private String cname;
	@Column(length = 15)
	private String surname;
	@Column(length = 12, nullable = false, unique = true)
	private long phone;
	@Column(length = 30, nullable = false, unique = true)
	private String email;
	@Column(length = 20)
	private String dob;
	
	@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
	private Address address;  //   aggregation
}
