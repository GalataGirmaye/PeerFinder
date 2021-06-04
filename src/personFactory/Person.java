/* 
 * Using factory method design pattern
 * Product interface
 * 
 * The interface is implemented by professional that share all person attributes
 * */

package personFactory;

import java.util.Date;

public interface Person {

	  public String getName();
	  public String getID();
	  public String getSex();
	  public Date getDOB();
	  public int getLevel();
	  public String getLocation();

	  public void setName(String name);
	  public void setID(String ID);
	  public void setSex(String sex);
	  public void setDOB(Date dob);
	  public void setLevel(int level);
	  public void setLocation(String Location);
	  
	  
	  // Operational Methods
}
