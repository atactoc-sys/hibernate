package com.labHibernedDemoProject.HibernetDemo.daoImpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.labHibernedDemoProject.HibernetDemo.dao.StudentDao;
import com.labHibernedDemoProject.HibernetDemo.entity.Student;
import com.labHibernedDemoProject.HibernetDemo.util.HibernetUtil;

public class StudentDaoImpl implements StudentDao
{

	@Override
	public void addStudent() 
	{
		
		Scanner sc = new Scanner(System.in);
		String n,d,e;
		long p;
		System.out.println("ENTER NAME");
		n = sc.nextLine();
		System.out.println("ENTER DEPERTMENT");
		d = sc.nextLine();
		System.out.println("ENTER EMAIL");
		e = sc.nextLine();
		System.out.println("ENTER PHONE_NO");
		p = sc.nextLong();
		
		Student s = new Student();
		s.setName(n);
		s.setDepertment(d);
		s.setEmailId(e);
		s.setPhone_no(p);
		
		Session session = HibernetUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		session.save(s);
		System.out.println("data saved successfully...");
		tr.commit();
		
	}

	@Override
	public void fetchStudent() 
	{
		
		Scanner sc = new Scanner(System.in);
		int id;
		System.out.println("enter the id");
		id = sc.nextInt();
		Session session = HibernetUtil.getSessionFactory().openSession();
		Student s1 = session.get(Student.class, id);
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getDepertment());
		System.out.println(s1.getPhone_no());
		System.out.println(s1.getEmailId());
		
	}

	@Override
	public void deleteStudent() 
	{
		
		Session session = HibernetUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER ID");
		int id = scanner.nextInt();
		Student stu12 = session.get(Student.class, id);
		session.delete(stu12);
		System.out.println("deleted successfully...");
		tr.commit();
		
	}

	@Override
	public void updateStudent() 
	{
		
		Session session = HibernetUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER ID");
		int id = scanner.nextInt();
		Student stu = session.get(Student.class, id);
		System.out.println("enter phone number");
		long phone = scanner.nextLong();
		stu.setPhone_no(phone);
		session.update(stu);
		System.out.println("updated successfully...");
		tr.commit();
		
		
	}

}
