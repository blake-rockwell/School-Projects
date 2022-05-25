
public interface BagInterface<T> {
	
	//adds specified value. returns true if successful
	public boolean add(T value);

	//returns array with bag contents
	public String[] toArray();
	
	//returns true if bag is full
	public boolean isFull();
	
}