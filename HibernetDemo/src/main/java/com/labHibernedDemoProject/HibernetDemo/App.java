package com.labHibernedDemoProject.HibernetDemo;

import java.util.Scanner;

import com.labHibernedDemoProject.HibernetDemo.daoImpl.StudentDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        StudentDaoImpl studentDaoImplobj = new StudentDaoImpl();
        char u;
        do 
        {
        	System.out.println("_____________________________________________________");
			System.out.println("PRESS 1 TO ADD STUDENT DATA\n PRESS 2 TO FETCH STUDENT DETAILS\n PRESS 3 TO UPDATE STUDENT DATA\n PRESS 4 TO DELETE STUDENT DATA\nPRESS 5 TO EXIT");
        	System.out.println("_____________________________________________________");
        	
        	Scanner scannerobj = new Scanner(System.in);
        	int a = scannerobj.nextInt();
        	
        	switch (a) 
        	{
			case 1:
				studentDaoImplobj.addStudent();
				break;
			case 2:
				studentDaoImplobj.fetchStudent();
				break;
			case 3:
				studentDaoImplobj.updateStudent();
				break;
			case 4:
				studentDaoImplobj.deleteStudent();
				break;
			case 5:
				System.exit(0);

			default:
				System.out.println("UPS.. WRONG INPUT");
				break;
				
			}
        	System.out.println("Do you want to continue  y / n");
        	u = scannerobj.next().charAt(0);
        	
		} while (u == 'y' || u == 'Y');
        System.out.println("thankyou...");
    }
}
