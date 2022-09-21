package com.example.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Employee 
{
	
	private int eid;
	private String ename;
	private long ephone;
	private double esalary;
	private String eaddress;
	
	
	
	//  generating getter and setter for private Employee
	
	// as lombok used, getter and setter created automatically 
	/*
	public int getEid() 
	{
		return eid;
	}
	
	public void setEid(int eid) 
	{
		this.eid = eid;
	}
	
	public String getEname() 
	{
		return ename;
	}
	
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	
	public long getEphone() 
	{
		return ephone;
	}
	
	public void setEphone(long ephone) 
	{
		this.ephone = ephone;
	}
	
	public double getEsalary() 
	{
		return esalary;
	}
	
	public void setEsalary(double esalary) 
	{
		this.esalary = esalary;
	}
	
	public String getEaddress() 
	{
		return eaddress;
	}
	
	public void setEaddress(String eaddress) 
	{
		this.eaddress = eaddress;
	}
	*/
	
	
	
}
