
public class BagTester {

	public static void main(String[] args) {
		//create bag
		Bag<Item> bag = new Bag<Item>();
		
	    //add items to bag
	    bag.add(new Item());
	    bag.add(new Item("Blue Shirt", 24.99));
	    bag.add(new Item("Green Pants", 32.99));
	    bag.add(new Item("Yellow Socks", 8.99));
	   
	    System.out.println(bag);
	}

}
