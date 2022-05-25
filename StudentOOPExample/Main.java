import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

//Object oriented programming example. Provides student class, and main class to test Student objects.
public class Main {
	public static void main(String[] args) {
		//create scanner object
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		//create linked list of object student
		LinkedList<Student> list = new LinkedList<Student>();
		System.out.println("How many student objects would you like to enter? ");
		int numStudents = scan.nextInt();
		//add numStudents number of student objects to LinkedList list
		for (int x = 0; x < numStudents; x++) {
			System.out.println("Enter student name:");
			String name = scan.next();
			System.out.println("Enter student address:");
			String address = scan.next();
			System.out.println("Enter student GPA:");
			double gpa = scan.nextDouble();
			while (gpa < 0 || gpa > 4.0) {
				System.out.println("Error: GPA not valid. Please enter a valid GPA");
				gpa = scan.nextDouble();
			}
			list.add(new Student(name, address, gpa));
		}
		
		//print unsorted list
		System.out.println(list);
		
		//sort list using comparator
		if (list.size() > 0) {
			  Collections.sort(list, new Comparator<Student>() {
			      @Override
			      public int compare(final Student object1, final Student object2) {
			          return object1.getName().compareTo(object2.getName());
			      }
			  });
		}
		
		//print sorted list
		System.out.println(list);
		
		//write to file
		try {
		      FileWriter myWriter = new FileWriter("C:\\Users\\Blake\\Documents\\School - CSU Global\\CSC372 Final Output.txt");
		      myWriter.write(list.toString());
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
		//close scanner
		scan.close();
	}
}
