package personFactory;

import java.util.Date;

import mainPkg.Application;

public class Lawyer implements Person {

	 String name,ID,sex,location,password,phone,email,notification;
	 Date dob;
	 int level;
	 Application application;
	 
	//Getter methods
	@Override
	public String getName() {

		return this.name;
	}

	@Override
	public String getID() {
		
		return this.ID;
	}

	@Override
	public String getSex() {

		return this.sex;
	}

	@Override
	public Date getDOB() {

		return this.dob;
	}

	@Override
	public String getPhone() {
		   return phone;	
		}
	@Override
	public String getEmail() {
			return email;
		}
	
	@Override
	public int getLevel() {

		return this.level;
	}

	@Override
	public String getLocation() {

		return this.location;
	}
	
	@Override
	public Application getApplication() {

		return this.application;
	}
    public String getNotification() {
    	return this.notification;
    }


	
	
   // Setter methods
	@Override
	public void setName(String name) {
           this.name= name;
	}

	@Override
	public void setID(String ID) {
		this.ID=ID;
	}

	  @Override
	  public void setPassword(String passwd) {
    	   this.password=passwd;
       }

	@Override
	public void setSex(String sex) {
		this.sex=sex;
	}

	@Override
	public void setDOB(Date dob) {
                
		this.dob=dob;
	}
	@Override
	public void setPhone(String phone) {
		  this.phone=phone;
		 
	  }
	@Override
	public void setEmail(String email) {
		  this.email=email;
	  }
	
	@Override
	public void setLevel(int level) {

		this.level=level;
	}

	@Override
	public void setLocation(String location) {

		this.location = location;
	}
	
	@Override
	public void setApplication(Application application) {

		this.application = application;
	}
	public void setNotification(String notification) {
    	this.notification=notification;
    }
	//Operational methods
	 public void setValues(String name,String id,String passwd,String sex,Date dob,String phone,String email,String location, int level) {
		  this.name = name;
		  this.ID = id;
		  this.password=passwd;
		  this.sex = sex;
		  this.dob  = dob;
		  this.phone=phone;
		  this.email=email;
		  this.location = location;
		  this.level = level;
	  }
	 
	 public boolean checkPassword(String passwd) {
		  if(passwd.equals(password))
		  {
			  return true;
		  }
		  
		  return false;
	  }
	 
	  public void updatePeer(Person peer) {
		  this.notification="Contrats "+this.name+",You peer has been found!\nCheck your status to see details!";
		  this.application.setPeer(peer);
		  this.application.setStatus(true);
	  }
}
