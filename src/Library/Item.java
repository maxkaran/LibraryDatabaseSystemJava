package Library;

public abstract class Item {
	private static int nextID = 0;//static int that is incremented by one and set as item ID whenever new item entry is created
	
	private int ID;
	private String name;
	
	public Item(String name) {		
		ID = ++nextID;
		this.name = name;
	}
	
	
	//setters & getters, note there is no ID setter since it is a static variable that increments when a new item is created
	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	//set the methods that all subclasses will need to implement individually
	public abstract double getLateFee(int daysLate);
	public abstract String toString();
}
