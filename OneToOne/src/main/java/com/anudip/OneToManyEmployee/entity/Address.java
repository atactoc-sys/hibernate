package com.anudip.OneToManyEmployee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address 
{
	@Id
	private long idNumber;
	@Column(length = 10)
	private String idType;
	@Column(length = 50)
	private String address;
	@Column(length = 20)
	private String city;
	@Column(length = 20)
	private String state;
	@Column(length = 6)
	private long pincode;
	
	@OneToOne(targetEntity = Citizen.class)
	private Citizen citizen;  //   aggregation
}
