package com.onetomanyex.emtity;

import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Data

public class Employee 
{
	@Id
	private int eId;
	@Column(length = 15, nullable = false)
	private String eName;
	@Column(length = 35, nullable = false)
	private String eAddress;
	@Column(length = 122, nullable = false)
	private long eContactNo;
	@Column(length = 5, nullable = false)
	private double eSalary;
	
}
