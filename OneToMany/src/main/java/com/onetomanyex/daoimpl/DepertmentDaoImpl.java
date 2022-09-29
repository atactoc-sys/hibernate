package com.onetomanyex.daoimpl;

import com.onetomanyex.config.HibernateUtill;
import com.onetomanyex.dao.DepertmentDao;
import com.onetomanyex.emtity.Depertment;
import com.onetomanyex.emtity.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class DepertmentDaoImpl implements DepertmentDao
{

	Session session = HibernateUtill.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	public void addDept() 
	{

		Depertment d = new Depertment();

		d.setDName("IT");
		d.setDName("Pallabi");

		Employee e = new Employee();
		e.setEId(45);
		e.setEName("Saikat");
		e.setEAddress("Arambagh");
		e.setEContactNo(764452);
		e.setESalary(59544.60);

		Employee e1 = new Employee();
		e1.setEId(46);
		e1.setEName("Daku");
		e1.setEAddress("Arambagh");
		e1.setEContactNo(964452);
		e1.setESalary(5954.60);

		ArrayList<Employee> o1 = new ArrayList<Employee>();
		o1.add(e);
		o1.add(e1);

		d.setEmployee(o1);
		session.save(d);
		transaction.commit();
		System.out.println("inserted successfully");

		
	}

	public void fetchDept() 
	{
		
		
	}

}
