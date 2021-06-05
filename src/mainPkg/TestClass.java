package mainPkg;

import personFactory.*;
public class TestClass {

	 
	public static void main(String[] args) {

	   Doctor dc = new Doctor();
	   dc.setName("Dr.Galata");
	   testInstance(dc);
	}

   public static void testInstance(Person p) {
	   
	   if(p instanceof Doctor)
	   {
		   System.out.println(p.getName()+" is instance of Doctor");
	   }
   }
}

