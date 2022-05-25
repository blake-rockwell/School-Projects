// Employee Class
class Employee {
  // Main Method, tests employee object methods
	public static void main(String[] args){
		Employee e = new Employee();
		e.setEmployeeID(1234);
		e.setFirstName("Old");
		e.setLastName("Greg");
		e.employeeSummary();
	}
	
	String firstName;
	String lastName;
	int employeeID;
	double salary;

	public Employee() {
		salary = 0;
	}
	public void employeeSummary() {
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Salary: " + salary);
	}
	public void setFirstName(String name) {
		firstName = name;
	}
	public void setLastName(String name) {
		lastName = name;
	}
	public void setEmployeeID(int id) {
		employeeID = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getEmployeeID() {
		return employeeID;
	}
}

class Manager extends Employee {
	String department;
	
	public void employeeSummary() {
		System.out.println("Department: " + department);
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Salary: " + salary);
	}
}

