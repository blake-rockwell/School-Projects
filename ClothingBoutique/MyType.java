
public class MyType {
	private String itemName;
	private double itemPrice;
	
	public MyType(String name, double price) {
		itemName = name;
		itemPrice = price;
	}
	
	public MyType() {
		itemName = "";
		itemPrice = 0;
	}

	public String toString() {
		return "(Item name: " + itemName + ", Price: $" + itemPrice +")";
	}
}
