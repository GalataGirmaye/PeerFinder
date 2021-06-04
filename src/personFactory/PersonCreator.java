package personFactory;

public class PersonCreator {

	public Person create(String personProfession) {
		
		
		if(personProfession.equals("Teacher")) {
			return new Teacher();
		}
		
		else if(personProfession.equals("Doctor")) {
			return new Doctor();
		}
		
		else if(personProfession.equals("Judge")) {
			return new Judge();
		}
		else if(personProfession.equals("Lawyer")) {
			return new Lawyer();
		}
		else if(personProfession.equals("Police")) {
			return new Police();
		}
		
		
		return null;
	}
}
