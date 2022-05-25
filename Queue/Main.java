import java.util.Scanner;

public class Main {
	static int NUMBER_OF_PEOPLE = 5; //adjust number of people in queue (default 5)

	public static void main(String[] args) {
		//open scanner
		Scanner input = new Scanner(System.in);
		//create queue
		Queue q =  new Queue();
		System.out.println("Add " + NUMBER_OF_PEOPLE + " people to the Queue.");
		//create queue
		for (int i = 1; i <= NUMBER_OF_PEOPLE; i++) {
			System.out.println("Enter first name of Person #" + i);
			String fn = input.next();
			System.out.println("Enter last name of Person #" + i);
			String ln = input.next();
			System.out.println("Enter age of Person #" + i);
			int a = input.nextInt();
			Person p = new Person(fn, ln, a);
			q.addPerson(p);
		}
		//output
		q.outputSort();	
		//close scanner
		input.close();
	}

}
