package HibernetdemoLab.Emmploiee;

import java.util.Scanner;

import HibernetdemoLab.Emmploiee.daoImpl.EmploieeDaoImpl;


public class App 
{
    public static void main( String[] args )
    {
        EmploieeDaoImpl emploieeDaoImplobj = new EmploieeDaoImpl();
        char u;
        do 
        {
        	System.out.println("_____________________________________________________");
			System.out.println("PRESS 1 TO ADD EMPLOIEE DATA\nPRESS 2 TO FETCH EMPLOIEE DETAILS\nPRESS 3 TO UPDATE EMPLOIEE DATA\nPRESS 4 TO DELETE EMPLOIEE DATA\nPRESS 5 TO EXIT");
        	System.out.println("_____________________________________________________");
        	
        	Scanner scannerobj = new Scanner(System.in);
        	int a = scannerobj.nextInt();
        	
        	switch (a)
			{
			case 1: 
				emploieeDaoImplobj.addEmploiee();
				break;
			
			case 2: 
				emploieeDaoImplobj.fetchEmploiee();
				break;
			
			case 3: 
				emploieeDaoImplobj.updateEmploiee();
				break;
			
			case 4:
				emploieeDaoImplobj.deleteEmploiee();
				
				break;
			
			case 5: 
				System.exit(0);
			

			default: 
				System.out.println("UPS.. WRONG INPUT");
				break;
			
			}
        	System.out.println("Do you want to continue in main menu (Y / N)");
        	u = scannerobj.next().charAt(0);
        	
		} while (u == 'y' || u == 'Y');
        System.out.println("thank-you...");
    }
}
