
public class Student {
	private int rollno;
	private String name;
	private String address;
	
	public Student (int r, String n, String a) {
		rollno = r;
		name = n;
		address = a;
	}
	
	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
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
	public void setRollno(int r) {
		rollno = r;
	}
	
	public String toString() {
        return "[rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
    }
	
}
