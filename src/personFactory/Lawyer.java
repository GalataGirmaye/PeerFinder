package personFactory;

import java.util.Date;

import mainPkg.Application;

public class Lawyer implements Person {

	 String name,ID,sex,location;
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
	public void setSex(String sex) {
		this.sex=sex;
	}

	@Override
	public void setDOB(Date dob) {
                
		this.dob=dob;
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
	
	
	 public void setValues(String name,String id,String sex,Date dob,String location, int level) {
		  this.name = name;
		  this.ID = id;
		  this.sex = sex;
		  this.dob  = dob;;
		  this.location = location;
		  this.level = level;
	  }
}
