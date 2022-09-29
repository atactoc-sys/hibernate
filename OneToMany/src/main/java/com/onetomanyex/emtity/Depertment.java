package com.onetomanyex.emtity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity

public class Depertment 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	@Column(length = 15, nullable = false)
	private String dName;
	@Column(length = 15, nullable = false)
	private String dHead;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Employee> employee;

}
