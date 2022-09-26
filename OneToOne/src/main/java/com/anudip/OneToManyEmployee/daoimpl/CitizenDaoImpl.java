package com.anudip.OneToManyEmployee.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.OneToManyEmployee.config.OneToOneBidirectionalUtil;
import com.anudip.OneToManyEmployee.dao.CitizenDao;
import com.anudip.OneToManyEmployee.entity.Address;
import com.anudip.OneToManyEmployee.entity.Citizen;

public class CitizenDaoImpl implements CitizenDao
{

	@Override
	public void addCitizen() 
	{
		
		Session session = OneToOneBidirectionalUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Citizen c = new Citizen();
		c.setCname("Saikat");
		c.setSurname("Mandi");
		c.setPhone(78582614);
		c.setEmail("ssikat.mandi@email.com");
		c.setDob("1997-04-24");
		
		Address a = new Address();
		a.setIdNumber(14578);
		a.setIdType("pan");
		a.setAddress("ertpoi");
		a.setCity("arambagh");
		a.setState("w.b.");
		a.setPincode(712616);
		
		//a.setCitizen(c);
		c.setAddress(a);
		session.save(c);
		transaction.commit();
		System.out.println("inserted");
		
		
		
		
		
		
		
		
	}

	@Override
	public void fetchCitizen() 
	{
		
		Citizen c1 = new Citizen();
		Address a1 = new Address();
		System.out.println(c1.getCname()+"  "+c1.getSurname());
		System.out.println(a1.getIdNumber()+"  "+a1.getIdType()+"  "+a1.getCity());
		
		
	}

}
