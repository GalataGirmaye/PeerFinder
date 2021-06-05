/*
 * This class applies singleton creational design pattern to 
 * create central  virtual database for the system.
 * and it holds all at one place
 *  
 */
package mainPkg;

import personFactory.*;

public class SingletonDb {

	private static SingletonDb obj;
	//Systems users
	Doctor[] doctors;
	Judge[] judges;
	Lawyer[] lawyers;
	Police[] polices;
	Teacher[] teachers;
	
	private SingletonDb() {
		
		doctors = new Doctor[50];
		judges = new Judge[50];
		lawyers = new Lawyer[50];
		polices = new Police[50];
		teachers = new Teacher[50];
	}
	
	public static SingletonDb getInstance()
	{
		if(obj == null) {
			obj = new SingletonDb();
		}
		
		
		return obj;
	}
    
	public void add(Person person) {
		
		if(person instanceof Doctor) {
			if(this.doctors[0] == null)
				doctors[0]=(Doctor) person;
			else
			 doctors[doctors.length]= (Doctor) person;
			System.out.println("Doctor added successully!");
			return;
		}
		
		if(person instanceof Judge) {
			if(this.judges[0] == null)
				judges[0]=(Judge)person;
			else
			judges[judges.length]= (Judge) person;
			
			System.out.println("Judge added successully!");
			return;
		}
		
		if(person instanceof Lawyer) {
			if(this.lawyers[0]==null)
				lawyers[0]=(Lawyer)person;
			else
			lawyers[lawyers.length]= (Lawyer) person;
			
			System.out.println("Lawyer added successully!");
			return;
		}
		
		if(person instanceof Police) {
			if(this.polices[0]==null)
				polices[0]= (Police) person;
			else
			polices[polices.length]= (Police) person;
			
			System.out.println("Police added successully!");
			return;
		}
		
		if(person instanceof Teacher) {
			if(this.teachers[0] == null)
				teachers[0]= (Teacher) person;
			else
				teachers[teachers.length]= (Teacher) person;
			
			System.out.println("Teacher added successully!");
			return;

		}
		
		
	}
	
	public Person getPerson(String id)
	{
		
		int i=0;
		if(this.doctors[0] != null) {
		   do{
			    if(doctors[i].getID().equals(id))
			    {
				    return doctors[i];
			    }
			    i++;
		   }while(doctors[i] != null);
		   
		 }
		
		i=0;
		if(this.judges[0] != null) {
			   do{
				    if(judges[i].getID().equals(id))
				    {
					    return judges[i];
				    }
				    i++;
			   }while(judges[i] != null);
			   
			 }
		
		i=0;
		if(this.lawyers[0] != null) {
			   do{
				    if(lawyers[i].getID().equals(id))
				    {
					    return lawyers[i];
				    }
				    i++;
			   }while(lawyers[i] != null);
			   
		 }
		
		i=0;
		if(this.polices[0] != null) {
			   do{
				    if(polices[i].getID().equals(id))
				    {
					    return polices[i];
				    }
				    i++;
			   }while(polices[i] != null);
			   
			 }

		i=0;
		if(this.teachers[0] != null) {
			   do{
				    if(teachers[i].getID().equals(id))
				    {
					    return teachers[i];
				    }
				    i++;
			   }while(teachers[i] != null);
			   
			 }
		
		 return null;
	  
	}
	
}
