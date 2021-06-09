package mainPkg;

import java.util.Date;
import java.util.Scanner;

import personFactory.*;

public class PeerFinder {

	 
	private Person person;
    private PersonCreator factory;
    private SingletonDb singleton;
    
	public void initiate() {
   
	 int option;
     Scanner scan = new Scanner(System.in);
     singleton = SingletonDb.getInstance();
     
   
     System.out.println(" ============ Well come ==========");
     System.out.println("1.Log In");
     System.out.println("2.Register");
     System.out.print("0.Exit \n :");
     option= scan.nextInt();
     
     if(option == 1) {
    	 login();
     }
     else  if(option == 2) {
         register();
     }
     else
    	 return ;
     
     
}

 public void register() {
		 String name,ID,sex,location,password,phone,email;
		 Date dob = new Date();
		 int level;
		 int choice;
         factory =new PersonCreator();
         Scanner scan = new Scanner(System.in);

		System.out.println("\n\n\n Enter information \n");
		System.out.print("Name:");  name= scan.next();
		System.out.print("Sex:\t1.Male \n\t2.Female:");   choice=scan.nextInt();
		  if(choice == 1) {
			 sex = "Male";
		  }
		  else {
			  sex = "Female";
		  }
		System.out.print("ID:");    				ID = scan.next();
		System.out.print("Phone Number:");   		phone=scan.next();
		System.out.print("Email:");          		email=scan.next();
		System.out.print("Password:");        		password=scan.next();
		System.out.print("Professional Level:");  	level= scan.nextInt();
		System.out.print("Current Location:");   	location = scan.next();
		System.out.println("Profession:");
			System.out.println("\t1.Teacher");
			System.out.println("\t2.Doctor");
			System.out.println("\t3.Judge");
			System.out.println("\t4.Lawyer");
			System.out.print("\t5.Police:");
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
		
		person.setValues(name, ID,password,sex, dob,phone,email, location, level);
		singleton.add(person);
	    menu();
}

  public void login() {

	  
	  int attempt=0;
	  String ID,password;
      Scanner scan = new Scanner(System.in);

	  while(attempt <3) {
			  System.out.print("ID:");     ID=scan.next(); 
			  System.out.print("Password:");   password=scan.next();
			  
			  if((person=singleton.getPerson(ID)) != null) {
			          if(person.checkPassword(password))
			          {
			        	  menu();
			        	  
			          }
			          else {
			        	  attempt++;
			          }
			          
			  }
			  else
			  {
				  System.out.println("Sorry, User not found");
				  attempt++;
			  }
	  
			  System.out.println("\n\n\n\n\n\n");
	  }
	  
	  System.out.println("Sorry, You cannot access the system");
  }
  
  public void menu() {
	  int choice;
      Scanner scan = new Scanner(System.in);

	  System.out.println("======== MENU ========");
	  System.out.println("\t1.Apply");
	  System.out.println("\t2.See Status");
	  System.out.println("\t3.See Notification");
	  System.out.println("\t4.Delete Account");
	  System.out.println("\t5.Log out");
 
	    choice=scan.nextInt();
	    
	   switch(choice) {
	   case 1:
		   apply();
		   break;
	   case 2:
		   status();
		   break;
	   case 3:
		   notification();
		   break;
	   case 4:
		   deleteAccount();
		   break;
	  default:
		   logout();
	   
	   }
     	  
  }
  
  public void apply() {
	  
	  String requestLocation;
      Scanner scan = new Scanner(System.in);

	  if(person.getApplication() != null) {   //If the person has applied before
		  System.out.println("Hello "+person.getName()+", you have applied to "+person.getApplication().getReqLocation());
		  System.out.print("Are you sure you want change it(Y/N):");
		  if(scan.next().equals("N"))
		  {
			  menu();
		  }
	  }
	  
	  System.out.println(person.getName()+":");
	  System.out.print("Request Location for Peer:");
	  requestLocation = scan.next();
	  person.setApplication(new Application(false,requestLocation,null));
	  singleton.match(this.person);
	  System.out.println("Successfully added requested. \nThe system will let you know as soon as your peer found.\n"
	  		+ "Check your status to know about your application");
	   menu();
	  
  }
  public void status() {
        if(this.person.getApplication()!=null && !this.person.getApplication().getStatus()) {
	       singleton.match(this.person);
        }
	  int choice;
      Scanner scan = new Scanner(System.in);
      System.out.println("Hello "+person.getName());
      
	  if(person.getApplication() == null) {   //If the person has applied before
		  System.out.println(" You have not applied yet!");
		  scan.nextLine();
			  menu();
	  }
	  else {
		  System.out.println("Request Location: "+person.getApplication().getReqLocation());
		  if(person.getApplication().getStatus()) {
			  System.out.println("Found Peer: "+person.getApplication().getPeer().getName());
			  System.out.println("1.Get peer info\t2.back");
			  System.out.print(":");   choice=scan.nextInt();
			  if(choice==1) {
				  System.out.println("\n\n\n\n\nDisplaying peer info:");
				  System.out.println("Name: "+person.getApplication().getPeer().getName());
				  System.out.println("Sex: "+person.getApplication().getPeer().getSex());
				  System.out.println("Phone: "+person.getApplication().getPeer().getPhone());
				  System.out.println("Email: "+person.getApplication().getPeer().getEmail());
				  scan.nextLine();
				  menu();
			  }
			  else {
				  menu();
			  }
		  }
		  else {
			  System.out.println("You have no found peer yet!");
			  scan.nextLine();
			  menu();
		  }
		  
	  }
		  
	  
  }
  public void notification() {
	    Scanner scan=new Scanner(System.in);

	  if(this.person.getNotification()==null) {
		   System.out.println("Sorry"+this.person.getName()+", there is no notification!");
	  }
	  else {
           System.out.println(this.person.getNotification());
           this.person.setNotification(null);
    }
    scan.nextLine();
	 menu(); 
  }
  public void deleteAccount() {
  
	  Scanner scan = new Scanner(System.in);
	  String choice;
	  
       if(this.person.getApplication().getStatus()) {
    	   System.out.println("Are you sure, You have already found peer.\n"
    	   		+ "Deleting your account may affect your peer too!(Y/N)");
    	   choice=scan.next();
    	   if(choice=="N"||choice=="n") {
    		   	return;
    	   }
       }
	   singleton.delete(this.person);
	   System.out.println("You have successfully deleted you account.\nPlease reregister to use the system.");
	   initiate();

  }
  public void logout() {
	  
	  initiate();
	  
  }
}
