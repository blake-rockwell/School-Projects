public class Student {
	
	private String name;
	private String address;
	private double gpa;
	
	public Student (String n, String a, double i) {
		gpa = i;
		name = n;
		address = a;
	}
	
	public String getName() {
		return name;
	}
	public double getgpa() {
		return gpa;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String n) {
		name = n;
	}
	public void setAddress(String a) {
		address = a;
	}
	public void setGPA(double i) {
		gpa = i;
	}
	
	public String toString() {
        return "[name=" + name + ", address=" + address + ", gpa=" + gpa + "]";
    }
	
}
