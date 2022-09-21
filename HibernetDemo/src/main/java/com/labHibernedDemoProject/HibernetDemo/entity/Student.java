package com.labHibernedDemoProject.HibernetDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(length = 25, nullable = false)
	private String name;
	@Column(length = 11, nullable = false, unique = true)
	private long phone_no;
	@Column(length = 25, nullable = false)
	private String depertment;
	@Column(length = 25, nullable = false, unique = true)
	private String emailId;
}
