package HibernetdemoLab.Emmploiee.daoImpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import HibernetdemoLab.Emmploiee.config.EmploieeUtil;
import HibernetdemoLab.Emmploiee.dao.EmploieeDao;
import HibernetdemoLab.Emmploiee.entity.Emploiee;

public class EmploieeDaoImpl implements EmploieeDao
{

	public void addEmploiee() 
	{
		
		Scanner sc = new Scanner(System.in);
		String n,a,d,e,des;
		long p;
		double s;
		
		System.out.println("ENTER NAME");
		n = sc.next();
		
		System.out.println("ENTER ADDRESS");
		a = sc.next();
		
		System.out.println("ENTER EMAIL");
		e = sc.next();
		
		System.out.println("ENTER PHONE_NO");
		p = sc.nextLong();
		
		System.out.println("ENTER DESIGNATION");
		des = sc.next();
		
		System.out.println("ENTER DEPERTMENT");
		d = sc.next();
		
		System.out.println("ENTER SALARY");
		s = sc.nextDouble();
		
		Emploiee emp = new Emploiee();
		emp.setName(n);
		emp.setAddress(a);
		emp.setEmailId(e);
		emp.setPhone_no(p);
		emp.setDesignation(des);
		emp.setDepertment(d);
		emp.setSalary(s);
		
		
		Session session = EmploieeUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		session.save(emp);
		System.out.println("data saved successfully...");
		tr.commit();
		
	}

	public void fetchEmploiee() 
	{
		
		Scanner sc = new Scanner(System.in);
		int id;
		System.out.println("enter the id");
		id = sc.nextInt();
		Session session = EmploieeUtil.getSessionFactory().openSession();
		Emploiee emp1 = session.get(Emploiee.class, id);
		
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getEmailId());
		System.out.println(emp1.getPhone_no());
		System.out.println(emp1.getDesignation());
		System.out.println(emp1.getDepertment());
		System.out.println(emp1.getSalary());
		
	}

	public void deleteEmploiee() 
	{
		
		Session session = EmploieeUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER ID");
		int id = scanner.nextInt();
		Emploiee emp2 = session.get(Emploiee.class, id);
		session.delete(emp2);
		System.out.println("deleted successfully...");
		tr.commit();
		
	}

	public void updateEmploiee() 
	{
		
		Session session = EmploieeUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER ID OF THE EMPLOIEE WHOSE DETAILS YOU WANT TO UPDATE");
		int id = scanner.nextInt();
		Emploiee emp3 = session.get(Emploiee.class, id);
		
		char c;
		do 
        {
        	System.out.println("_____________________________________________________");
			System.out.println("PRESS 1 TO UPDATE PHONE \nPRESS 2 TO UPDATE EMAIL\nPRESS 3 TO UPDATE DESIGNATION \nPRESS 4 TO UPDATE SALARY");
        	System.out.println("_____________________________________________________");
        	
        	
        	int o = scanner.nextInt();
        	
        	switch (o) 
        	{
			case 1:
			{
				
				System.out.println("ENTER NEW PHONE NUMBER");
				long phone = scanner.nextLong();
				emp3.setPhone_no(phone);
				session.update(emp3);
				System.out.println("updated successfully...");
				tr.commit();
			}
				break;
			case 2:
			{
			
				System.out.println("ENTER NEW EMAIL ID");
				String email = scanner.nextLine();
				emp3.setEmailId(email);
				session.update(emp3);
				System.out.println("updated successfully...");
				tr.commit();
			}
				break;
			case 3:
			{
				
				System.out.println("ENTER NEW DESIGNATION");
				String designation = scanner.nextLine();
				emp3.setDesignation(designation);
				session.update(emp3);
				System.out.println("updated successfully...");
				tr.commit();
			}
				break;
			case 4:
			{
				
				System.out.println("ENTER NEW SALARY");
				double salary = scanner.nextDouble();
				emp3.setSalary(salary);
				session.update(emp3);
				System.out.println("updated successfully...");
				tr.commit();
			}
				break;
			default:
				System.out.println("UPS.. WRONG INPUT");
				break;
				
			}
        	System.out.println("Do you want to continue update  (Y / N)");
        	c = scanner.next().charAt(0);
        	
		} while (c == 'y' || c == 'Y');

	}
	
}
