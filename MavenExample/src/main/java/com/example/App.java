package com.example;

import com.example.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
        //creating object of employee class
    	Employee employeeobj = new Employee();
    	
    	//  Invoking setter() of employee using employeeobj
    	employeeobj.setEid(101);
    	employeeobj.setEname("Saikat");
    	employeeobj.setEphone(78947458);
    	employeeobj.setEaddress("Arambagh");
    	employeeobj.setEsalary(1145.00);
    	
    	//printing Employee getters
    	System.out.println(employeeobj.getEid()+"  "+employeeobj.getEname()+"  "+employeeobj.getEphone()+"  "+employeeobj.getEaddress()+"  "+employeeobj.getEsalary());
    	
    }
}
