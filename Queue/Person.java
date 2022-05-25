
public class Person {
	String firstName;
	String lastName;
	int age;
	
	public Person() {
		
	}
	
	public Person(String fn, String ln, int a) {
		firstName = fn;
		lastName = ln;
		age = a;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setFirstName(String fn) {
		firstName = fn;
	}
	
	public void setAge(int a) {
		age = a;
	}
}
