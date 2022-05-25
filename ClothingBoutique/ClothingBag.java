import java.util.Arrays;

public class ClothingBag implements BagInterface<MyType> {
	private MyType[] myBag;
	private int numberofProducts;
	private int Default_Capacity;
	
	ClothingBag() {
		numberofProducts = 0;
		Default_Capacity = 1;
		myBag = new MyType[Default_Capacity];
	}
	
	
	public boolean add(MyType newValue) {
		if (numberofProducts == myBag.length) {
			myBag = Arrays.copyOf(myBag, (myBag.length + 1));
		}
		myBag[numberofProducts] = newValue;
		numberofProducts++;
		return true;
	}
	
	/**
	public MyType[] toArray() {
		return myBag;
	}
	*/
	

	public boolean isFull() {
		return myBag.length == Default_Capacity;
	}

	
	public String[] toArray() {
		String[] output = new String[numberofProducts];
		
		for (int x = 0; x < numberofProducts; x++) {
			output[x] = myBag[x].toString();
		}
		return output;
	}

}
