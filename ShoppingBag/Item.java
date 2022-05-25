
public class Item {
	private String itemName;
	private double itemPrice;
	
	public Item(String name, double price) {
		itemName = name;
		itemPrice = price;
	}
	
	public Item() {
		itemName = "";
		itemPrice = 0;
	}

	
	public String toString() {
		return "Item name: " + itemName + "\nPrice: $" + itemPrice +"\n";
	}
}
