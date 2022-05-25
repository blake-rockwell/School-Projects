import java.util.ArrayList;

public class Queue {
	String SORT_CHOICE = "lastname"; // sort by last name by default
	
	ArrayList<Person> qList;
	Queue() {
		qList = new ArrayList<Person>();
	}
	
	public void addPerson(Person p) {
		qList.add(p);
	}
	
	public void printQueue() {
		for (Person p : qList) {
			System.out.println(p.firstName + " " + p.lastName + ", " + p.age);
		}
	}
	
	public void SortByAge() {
		
	}
	
	public void SortByLastName() {
		
	}
	
	static void swap(ArrayList<Person> q, int i, int j)
	{
	    Person temp = q.get(i);
	    q.set(i, q.get(j));
	    q.set(j, temp);
	}
	void sortQueue(ArrayList<Person> queue, int low, int high) {
	    if (low < high) {
	        int p = partition(queue, low, high);
	        sortQueue(queue, low, p - 1);
	        sortQueue(queue, p + 1, high);
	    }
	}

	private int partition(ArrayList<Person> queue, int low, int high) {
		if (SORT_CHOICE == "age") { // sort by age
	        double pivot = queue.get(high).getAge();
	        int i = (low - 1); //swap
	        for (int j = low; j < high; j++) {
	            //if smaller or equal to pivot
	            if (queue.get(j).getAge() > pivot) {
		                i++;
		                //swap
		                swap(queue, i, j);
		            }
	        }
			        //swap
			swap(queue, i+1, high);
			return i + 1;
			        
			} else { //sort by last name
		        String pivot = queue.get(high).getLastName();
		        int i = (low - 1); // smaller element
		        for (int j = low; j < high; j++) {
		           
		            if (queue.get(j).getLastName().compareTo(pivot) > 0) {
		                i++;

		                //swap
		                swap(queue, i, j);
		            }
		        }

		        //swap
		        swap(queue, i+1, high);
		        return i + 1;	
			}
	}
	
	void outputSort() {
	    System.out.println("Starting queue: ");
	    printQueue();
	    SORT_CHOICE = "age";
	    sortQueue(qList, 0, qList.size() - 1);
	    System.out.println("\nQueue sorted by age, descending: ");
	    printQueue();
	    SORT_CHOICE = "lastname";
	    sortQueue(qList, 0, qList.size() - 1);
	    System.out.println("\nQueue sorted by last name, descending: ");
	    printQueue();
	}
	
	
}
