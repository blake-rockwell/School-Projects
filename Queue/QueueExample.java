import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<>();
		q.add("Banana");
		q.add("Orange");
		q.add("Apple");
		q.add("Kiwi");
		
		for (String s : q) {
			System.out.println(s);
		}
	}

}
