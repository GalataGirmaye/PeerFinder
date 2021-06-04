package mainPkg;

import java.util.Date;
import java.util.Scanner;

import personFactory.*;

public class PeerFinder {

	 
	Person person;
    PersonCreator factory;
    
	public static void main(String[] args) {
   
	 int option;
     Scanner scan = new Scanner(System.in);
     
     
     System.out.println(" ====== Well come =====");
     System.out.println("1.Log In");
     System.out.println("2.Register");
     System.out.print("2.Exit \n :");
     option= scan.nextInt();
     
     if(option == 1)
    	 login();
     else  if(option == 2) {
    	 
     }
     else
    	 return ;
     
	}

	
	public static void login() {
		 String name,ID,sex,location;
		 Date dob;
		 int level;
		 
		System.out.println("\n\n\n Enter information \n");
		
	}
}
