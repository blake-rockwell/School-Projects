import java.util.Arrays;

public class BoutiqueBagDemo {
	
	//initialize bag variable
	private static ClothingBag bag = new ClothingBag();
	
	//add items to bag
	public static void testAddl() {
	    bag.add(new MyType("Blue Shirt", 24.99));
	    bag.add(new MyType("Green Pants", 32.99));
	    bag.add(new MyType("Yellow Socks", 8.99));
	}
	
	//displays contents of bag
	public static void displayBag() {
		System.out.println(Arrays.toString(bag.toArray()));
	}
	
	//main method
	public static void main(String[] args) {
		testAddl();
		displayBag();
	}
}