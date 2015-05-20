import java.util.UUID;


public class Person {
	private String FirstName;
	private String LastName;
	private UUID PersonID;
	
	public Person(String firstName, String lastName, UUID personID){
		this.FirstName = firstName;
		this.LastName = lastName;
		this.PersonID = personID;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public UUID getPersonID() {
		return PersonID;
	}
	public void setPersonID(long mostSigBits, long leastSigBits) {
		PersonID = new UUID(mostSigBits, leastSigBits);
	}
	
	
	

	
}
