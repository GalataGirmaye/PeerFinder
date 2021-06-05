package mainPkg;

import java.util.Date;
import java.util.Scanner;

import personFactory.*;

public class PeerFinder {

	 
	private Person person;
    private PersonCreator factory;
    
	public void initiate() {
   
	 int option;
     Scanner scan = new Scanner(System.in);
     
     
     System.out.println(" ============ Well come ==========");
     System.out.println("1.Log In");
     System.out.println("2.Register");
     System.out.print("0.Exit \n :");
     option= scan.nextInt();
     
     if(option == 1) {
    	 login();
     }
     else  if(option == 2) {
    	 System.out.print("You choose register");
     }
     else
    	 return ;

     
}

	
	public void login() {
		 String name,ID,sex,location;
		 Date dob;
		 int level;
		 int choice;
	     Scanner scan = new Scanner(System.in);
         factory =new PersonCreator();
		 
		System.out.println("\n\n\n Enter information \n");
		System.out.print("Name:");  name= scan.next();
		System.out.println("Sex:\t1.Male \n\t2.Female");   choice=scan.nextInt();
		  if(choice == 1) {
			 sex = "Male";
		  }
		  else {
			  sex = "Female";
		  }
		System.out.print("ID:");    ID = scan.next();
		System.out.print("Professional Level:");  level= scan.nextInt();
		System.out.println("Current Location:");   location = scan.next();
		System.out.println("Profession:");
			System.out.println("1.Teacher");
			System.out.println("2.Doctor");
			System.out.println("3.Judge");
			System.out.println("4.Lawyer");
			System.out.println("5.Police");
			    choice= scan.nextInt();
		switch(choice) {
		case 1:
			person = factory.create("Teacher");
			break;
		case 2:
			person = factory.create("Doctor");
			break;
		case 3:
			person = factory.create("Judge");
			break;
		case 4:
			person = factory.create("Lawyer");
			break;
		default:
			person = factory.create("Police");
			
		}
		
		
	}
}
