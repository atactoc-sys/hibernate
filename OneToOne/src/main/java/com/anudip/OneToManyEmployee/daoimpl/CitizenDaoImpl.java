package com.anudip.OneToManyEmployee.daoimpl;

import java.util.Iterator;
import java.util.List;

import com.anudip.OneToManyEmployee.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.anudip.OneToManyEmployee.dao.CitizenDao;
import com.anudip.OneToManyEmployee.entity.Address;
import com.anudip.OneToManyEmployee.entity.Citizen;



public class CitizenDaoImpl implements CitizenDao
{

	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();

	@Override
	public void addCitizen() 
	{
		

	    //   created citizen object
		Citizen c = new Citizen();
	    //   setting citizen details using setters
		c.setCname("Kartick ");
		c.setSurname("Mandi");
		c.setPhone(769894);
		c.setEmail("saikat7.mandi@email.com");
		c.setDob("52");
		//   created Address object
		Address a = new Address();
	    //   setting address details using setters
		a.setIdNumber(199889);
		a.setIdType("adhar");
		a.setAddress("Dakshin Balarampur");
		a.setCity("arambagh");
		a.setState("w.b.");
		a.setPincode(712616);
		
		//a.setCitizen(c);
		c.setAddress(a);
		//  saving citizen details
		session.save(c);
	    //  saving citizen permanently details into db
		transaction.commit();
		System.out.println("inserted");
		
		
		
		
		
		
		
		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void fetchCitizen() 
	{

		
		Query q = session.createQuery("from Citizen");
		List<Citizen> ab = q.getResultList();
		Iterator<Citizen> itr = ab.iterator();
		while (itr.hasNext())
		{
			
			Citizen c1 = new Citizen();
			Address a1 = new Address();
			//   displaying details of setter using citizen getters
			System.out.println(c1.getCname()+"  "+c1.getSurname());
		    //   displaying details of setter using address getters
			System.out.println(a1.getIdNumber()+"  "+a1.getIdType()+"  "+a1.getCity());
			
		}

	}

}
