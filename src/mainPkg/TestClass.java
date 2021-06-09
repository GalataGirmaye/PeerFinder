package mainPkg;

import personFactory.*;
import java.util.*;

public class TestClass {

	 
	public static void main(String[] args) {

		int attempt=0;
	    PersonCreator factory=new PersonCreator();

		String ID,password;
		SingletonDb singleton=SingletonDb.getInstance();
		Person person,person2;
		Scanner scan = new Scanner(System.in);
	    person = factory.create("Teacher");
	    person2 = factory.create("Teacher");
		  
	    if(person.getClass().equals(person2.getClass())){
	    	System.out.println("Hello");
	    }
	}
}

