/*
 * This class applies singleton creational design pattern to 
 * create central  virtual database for the system.
 * and it holds all at one place
 *  
 */
package mainPkg;

public class SingletonDb {

	private static SingletonDb obj;
	public SingletonDb getInstance()
	{
		if(obj == null) {
			obj = new SingletonDb();
		}
		
		return obj;
	}

}
