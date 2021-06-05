/* 
 * Using factory method design pattern
 * Product interface
 * 
 * The interface is implemented by professional that share all person attributes
 * */

package personFactory;

import java.util.Date;
import mainPkg.Application;

public interface Person {

	  public String getName();
	  public String getID();
	  public String getSex();
	  public Date getDOB();
	  public int getLevel();
	  public String getLocation();
	  public Application getApplication();

	  
	  public void setName(String name);
	  public void setID(String ID);
	  public void setPassword(String str);
	  public void setSex(String sex);
	  public void setDOB(Date dob);
	  public void setLevel(int level);
	  public void setLocation(String Location);
	  public void setApplication(Application application);
	  
	  
	  // Operational Methods
	  public void setValues(String name,String id,String passwd,String sex,Date dob,String location, int level);
	  public boolean checkPassword(String str);
}
