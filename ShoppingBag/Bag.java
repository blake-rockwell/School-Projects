import java.util.Iterator;

public class Bag<Item>  implements Iterable<Item> {
	
	private Node<Item> first; 	//front of bag
	private int n;	//bag size
	
	//LinkedList implementation
	private static class Node<Item> {
		private Item item;
		private Node<Item> next; //pointer to next element
	}
	
	//default  constructor
	public Bag() {
		first = null;
		n = 0;
	}
	
	//returns true if bag is empty
	public boolean isEmpty() {
		return first == null;
	}
	
	//returns number of items in bag
	public int size() {
		return n;
	}
	
	//adds item to bag
	public void add(Item i) {
		Node<Item> previous = first;
		first = new Node<Item>();
		first.item = i;
		first.next = previous;
		n++; //increase bag size
	}

	public Iterator<Item> iterator() {
		return null;
	}
	
	public String toString() {
		String result = "";
        Node current = first;
        while(current.next != null){
            result += current.item;
            current = current.next;
        }
        return result;
	}
	 
}