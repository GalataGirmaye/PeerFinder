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
	  public String getPhone();
	  public String getEmail();
	  public int getLevel();
	  public String getLocation();
	  public Application getApplication();
      public String getNotification();
	  
	  public void setName(String name);
	  public void setID(String ID);
	  public void setPassword(String str);
	  public void setSex(String sex);
	  public void setDOB(Date dob);
	  public void setPhone(String phone);
	  public void setEmail(String email);
	  public void setLevel(int level);
	  public void setLocation(String Location);
	  public void setApplication(Application application);
      public void setNotification(String Notification);

	  
	  // Operational Methods
	  public void setValues(String name,String id,String passwd,String sex,Date dob,String phone,String email
			  ,String location, int level);
	  public boolean checkPassword(String str);
	  public void updatePeer(Person person);
}
