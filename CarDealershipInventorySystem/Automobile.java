import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/**
 * 
Create an automobile class that will be used by a dealership as a vehicle inventory program. The following attributes should be present in your automobile class:

private string make
private string model
private string color
private int year
private int mileage.
Your program should have appropriate methods such as:

default constructor
parameterized constructor
add a new vehicle  method
list vehicle information (return string array)
remove a vehicle method
update vehicle attributes method.
All methods should include try..catch constructs. Except as noted all methods should return a success or failure message (failure message defined in "catch").

Create an additional class to call your automobile class (e.g., Main or AutomobileInventory). Include a try..catch construct and print it to the console.
Call automobile class with parameterized constructor (e.g., "make, model, color, year, mileage").
Then call the method to list the values. Loop through the array and print to the screen.
Call the remove vehicle method to clear the variables.
Print the return value.
Add a new vehicle.
Print the return value.
Call the list method and print the new vehicle information to the screen.
Update the vehicle.
Print the return value.
Call the listing method and print the information to the screen.
Display a message asking if the user wants to print the information to a file (Y or N).
Use a scanner to capture the response. If "Y", print the file to a predefined location (e.g., C:\Temp\Autos.txt). Note: you may want to create a method to print the information in the main class.
If "N", indicate that a file will not be printed.
 *
 */

class Automobile {
	
	class AutomobileInventory {
		private ArrayList<Automobile> autoList;
		public void addAuto(Automobile car) {
			try {
				autoList.add(car);
			} catch (InputMismatchException e) {
				System.out.println("Error: unexpected input type");
			}
		}
		public void removeAuto(Automobile car) {
			try {
				autoList.remove(car);
			} catch (InputMismatchException e) {
				System.out.println("Error: unexpected input type");
			}
		}
		public void modifyAuto(Automobile car, String make, String model, String color, int year, int mileage) {
			car.setMake(make);
			car.setModel(model);
			car.setColor(color);
			car.setYear(year);
			car.setMileage(mileage);
		}
		public void modifyAuto(Automobile car) {
			
		}
		public void printAutoList() {
			for (Automobile car : autoList) {
				System.out.println(car.toString());
			}
		}
		
	}
	
	public static void main(String[] args) {
		//PrintWriter FileOutput = new PrintWriter(“MyOutput.txt”);
		//FileOutputStream MyFile = FileOutputStream File(“MyText.txt”);
		List<Automobile> autos = new ArrayList<>();
		ArrayList<Automobile> autoList = new ArrayList<Automobile>();
		autos.add(new Automobile("Honda", "Accord", "Blue", 2013, 75352));
		autos.add(new Automobile("Lexus", "IS350", "White", 2011, 80600));
		System.out.println(autos);
		
		//test that default constructor works
		//Automobile jinky = new Automobile();
		//System.out.println(jinky);
	}
	
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	

	public Automobile(String make, String model, String color, int year, int mileage) {
		try {
			this.make = make;
			this.model = model;
			this.color = color;
			this.year = year;
			this.mileage = mileage;
		}  catch (InputMismatchException e) {
			System.out.println("Error unexpected type");
		}
		
	}
	public Automobile() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter car make: ");
		setMake(input.nextLine());
		System.out.print("Enter car model: ");
		setModel(input.nextLine());
		System.out.print("Enter car color: ");
		setColor(input.nextLine());
		System.out.print("Enter car year: ");
		setYear(input.nextInt());
		System.out.print("Enter car mileage year: ");
		setMileage(input.nextInt());
	}

	public String toString() {
		return "Make: " + make + ", Model: " + model + ", Color: " + color + ", Year: " + year + ", Milage: " + mileage + "\n";
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	  
}
