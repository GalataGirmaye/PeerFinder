/*
 * This class applies singleton creational design pattern to 
 * create central  virtual database for the system.
 * and it holds all at one place
 *  
 */
package mainPkg;

import personFactory.*;

public class SingletonDb implements Visitor{

	private static SingletonDb obj;
	//Systems users
	Doctor[] doctors;
	Judge[] judges;
	Lawyer[] lawyers;
	Police[] polices;
	Teacher[] teachers;
	
	int doctorNumber=0;
	int judgeNumber=0;
	int lawyerNumber=0;
	int policeNumber=0;
	int teacherNumber=0;
	
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
			else {
			 doctors[doctorNumber]= (Doctor) person;
			   
			}
			doctorNumber++;
			System.out.println("Doctor added successully!");
			return;
		}
		
		if(person instanceof Judge) {
			if(this.judges[0] == null)
				judges[0]=(Judge)person;
			else
			judges[judgeNumber]= (Judge) person;
			judgeNumber++;
			System.out.println("Judge added successully!");
			return;
		}
		
		if(person instanceof Lawyer) {
			if(this.lawyers[0]==null)
				lawyers[0]=(Lawyer)person;
			else
			lawyers[lawyerNumber]= (Lawyer) person;
			lawyerNumber++;
			System.out.println("Lawyer added successully!");
			return;
		}
		
		if(person instanceof Police) {
			if(this.polices[0]==null)
				polices[0]= (Police) person;
			else
			polices[policeNumber]= (Police) person;
			policeNumber++;
			System.out.println("Police added successully!");
			return;
		}
		
		if(person instanceof Teacher) {
			if(this.teachers[0] == null)
				teachers[0]= (Teacher) person;
			else
				teachers[teacherNumber]= (Teacher) person;
			teacherNumber++;
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
	public void match(Person applicant) {
		int i=0;
		if(applicant instanceof Doctor) {
			if(this.doctors[0] != null) {
				   do{
					    if(doctors[i].getID().equals(applicant.getID()))
					    {
						   
					    }
					    else if((doctors[i].getApplication()!=null)&&(!doctors[i].getApplication().getStatus())) {
					    	
						    	if(doctors[i].getApplication().getReqLocation().equals(applicant.getLocation())&& 
						    			doctors[i].getLocation().equals(applicant.getApplication().getReqLocation()))
						    	{
						    	        if(doctors[i].getLevel()==applicant.getLevel())
						    	        {
						    	             notify(doctors[i],applicant);   
						    	                return;
						    	        }
						    	}
					    	
					    }
					    i++;
				   }while(doctors[i] != null);
				   
				 }
				
		}
		
		
		if(applicant instanceof Judge) {
			if(this.judges[0] != null) {
				   do{
					    if(judges[i].getID().equals(applicant.getID()))
					    {
						   
					    }
					    else if((judges[i].getApplication()!=null)&&(!judges[i].getApplication().getStatus())) {
					    	
						    	if(judges[i].getApplication().getReqLocation().equals(applicant.getLocation())&& 
						    			judges[i].getLocation().equals(applicant.getApplication().getReqLocation()))
						    	{
						    	        if(judges[i].getLevel()==applicant.getLevel())
						    	        {
						    	             notify(judges[i],applicant);   
						    	                return;
						    	        }
						    	}
					    	
					    }
					    i++;
				   }while(judges[i] != null);
				   
				 }
				
		}
		
		if(applicant instanceof Lawyer) {
			if(this.lawyers[0] != null) {
				   do{
					    if(lawyers[i].getID().equals(applicant.getID()))
					    {
						   
					    }
					    else if((lawyers[i].getApplication()!=null)&&(!lawyers[i].getApplication().getStatus())) {
					    	
						    	if(lawyers[i].getApplication().getReqLocation().equals(applicant.getLocation())&& 
						    			lawyers[i].getLocation().equals(applicant.getApplication().getReqLocation()))
						    	{
						    	        if(lawyers[i].getLevel()==applicant.getLevel())
						    	        {
						    	             notify(lawyers[i],applicant);   
						    	                return;
						    	        }
						    	}
					    	
					    }
					    i++;
				   }while(lawyers[i] != null);
				   
				 }
				
		}
		
		if(applicant instanceof Police) {
			if(this.polices[0] != null) {
				   do{
					    if(polices[i].getID().equals(applicant.getID()))
					    {
						   
					    }
					    else if((polices[i].getApplication()!=null)&&(!polices[i].getApplication().getStatus())) {
					    	
						    	if(polices[i].getApplication().getReqLocation().equals(applicant.getLocation())&& 
						    			polices[i].getLocation().equals(applicant.getApplication().getReqLocation()))
						    	{
						    	        if(polices[i].getLevel()==applicant.getLevel())
						    	        {
						    	             notify(polices[i],applicant);   
						    	                return;
						    	        }
						    	}
					    	
					    }
					    i++;
				   }while(polices[i] != null);
				   
				 }
				
		}
		
		if(applicant instanceof Teacher) {
			if(this.teachers[0] != null) {
				   do{
					    if(teachers[i].getID().equals(applicant.getID()))
					    {
						   
					    }
					    else if((teachers[i].getApplication()!=null)&&(!teachers[i].getApplication().getStatus())) {
					    	
						    	if(teachers[i].getApplication().getReqLocation().equals(applicant.getLocation())&& 
						    			teachers[i].getLocation().equals(applicant.getApplication().getReqLocation()))
						    	{
						    	        if(teachers[i].getLevel()==applicant.getLevel())
						    	        {
						    	             notify(teachers[i],applicant);   
						    	                return;
						    	        }
						    	}
					    	
					    }
					    i++;
				   }while(teachers[i] != null);
				   
				 }
				
		}
		
		
	}
	
	

    public void notify(Person person_1,Person person_2) {
    	
	 person_1.updatePeer(person_2);
	 person_2.updatePeer(person_1);

}


//Visitor implement
    public void delete(Person person) {
	   
    	  int i=0;
	if(person instanceof Doctor) {
		if(doctorNumber >= 1) {
			   do{
				   if(person.getID()== doctors[i].getID()) {
						   if(person.getApplication().getStatus()) {
							   person.getApplication().getPeer().setNotification("Your peer has deleted account.check your status.");
							   person.getApplication().getPeer().getApplication().setPeer(null);
							   person.getApplication().getPeer().getApplication().setStatus(false);
							   person.getApplication().setPeer(null);
							   person.getApplication().setStatus(false);
					    	   }
						   doctors[i]=doctors[doctorNumber-1];
						   doctors[doctorNumber-1]=null;
						   
						   return;
				   }
				    i++;
			   }while(doctors[i] != null);
		}
	}
	
	if(person instanceof Judge) {
		if(judgeNumber >= 1) {
			   do{
				   if(person.getID()== judges[i].getID()) {
						   if(person.getApplication().getStatus()) {
							   person.getApplication().getPeer().setNotification("Your peer has deleted account.check your status.");
							   person.getApplication().getPeer().getApplication().setPeer(null);
							   person.getApplication().getPeer().getApplication().setStatus(false);
							   person.getApplication().setPeer(null);
							   person.getApplication().setStatus(false);
					    	   }
						   judges[i]=judges[judgeNumber-1];
						   judges[judgeNumber-1]=null;
						   
						   return;
				   }
				    i++;
			   }while(judges[i] != null);
		}
	}
	
	
	if(person instanceof Lawyer) {
		if(lawyerNumber >= 1) {
			   do{
				   if(person.getID()== lawyers[i].getID()) {
						   if(person.getApplication().getStatus()) {
							   person.getApplication().getPeer().setNotification("Your peer has deleted account.check your status.");
							   person.getApplication().getPeer().getApplication().setPeer(null);
							   person.getApplication().getPeer().getApplication().setStatus(false);
							   person.getApplication().setPeer(null);
							   person.getApplication().setStatus(false);
					    	   }
						   lawyers[i]=lawyers[lawyerNumber-1];
						   doctors[lawyerNumber-1]=null;
						   
						   return;
				   }
				    i++;
			   }while(lawyers[i] != null);
		}
	}
	
	if(person instanceof Police) {
		if(policeNumber >= 1) {
			   do{
				   if(person.getID()== polices[i].getID()) {
						   if(person.getApplication().getStatus()) {
							   person.getApplication().getPeer().setNotification("Your peer has deleted account.check your status.");
							   person.getApplication().getPeer().getApplication().setPeer(null);
							   person.getApplication().getPeer().getApplication().setStatus(false);
							   person.getApplication().setPeer(null);
							   person.getApplication().setStatus(false);
					    	   }
						   polices[i]=polices[policeNumber-1];
						   polices[policeNumber-1]=null;
						   
						   return;
				   }
				    i++;
			   }while(polices[i] != null);
		}
	}
	
	
	if(person instanceof Teacher) {
		if(teacherNumber >= 1) {
			   do{
				   if(person.getID()== teachers[i].getID()) {
						   if(person.getApplication().getStatus()) {
							   person.getApplication().getPeer().setNotification("Your peer has deleted account.check your status.");
							   person.getApplication().getPeer().getApplication().setPeer(null);
							   person.getApplication().getPeer().getApplication().setStatus(false);
							   person.getApplication().setPeer(null);
							   person.getApplication().setStatus(false);
					    	   }
						   teachers[i]=teachers[teacherNumber-1];
						   teachers[teacherNumber-1]=null;
						   
						   return;
				   }
				    i++;
			   }while(teachers[i] != null);
		}
	}
	
  }
}
