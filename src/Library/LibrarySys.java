package Library;
import java.util.ArrayList;

public class LibrarySys {
	
	final static double laptopPrice = 35; //price to rent laptops per day in dollars
	final static double adapterPrice = 8; //price to rent adapters per day in dollars
	
	ArrayList<Rental> rentals = new ArrayList<Rental>();
	
	public void addTransaction(Rental rental){
		rentals.add(rental);
	}
	
	public double getTotalLateFees(){
		double totFees=0;
		for(Rental rental : rentals){
			totFees += rental.getRentedItem().getLateFee(rental.getLateDays());
		}
		return totFees;
	}
	
	public double getTotalRentalCosts(){
		double totCost = 0;
		for(Rental rental : rentals){
			if(rental.getRentedItem() instanceof Device)
				totCost += ((Device) rental.getRentedItem()).getRentalCost() * rental.getRentalDays();
		}
		return totCost;
	}
	
	public static void main(String[] args){
		//some sample items that could be found at the library
		Textbook textbook1 = new Textbook("7th Edition Human Biology", "Brad McCann, Tom Stettler", "Oxford Press", 2012);
		Book book1 = new Book("Moby Dick", "Herman Melville", "Harper & Brothers", 1851);
		Laptop laptop1 = new Laptop("Toshiba", laptopPrice);
		Adapter adapter1 = new Adapter(adapterPrice);
		Device device1 = new Device("Charger", 15);
		Book book2 = new Book("Where's Waldo?", "Martin Handford", "Scholastic", 2002);
		Textbook textbook2 = new Textbook(textbook1); //demonstrate copy constructor
		
		//check if copy contructor produced to identical textbooks
		System.out.println(textbook1.toString() + textbook2.toString());
		System.out.println("textbook 1 and textbook 2 are equal?\n" + textbook1.equals(textbook2) + "\n");//test the equals function
		
		//now start keeping track of transactions
		LibrarySys transactions =new LibrarySys();
		
		transactions.addTransaction(new Rental(textbook1, 1014, 14, 0)); //someone borrowed textbook1, has customer ID 1014, for 7 days, with no late days
		transactions.addTransaction(new Rental(textbook2, 1045, 14, 4)); //someone borrowed textbook1, has customer ID 1045, for 7 days, with 4 late days
		transactions.addTransaction(new Rental(laptop1, 1337, 7, 2));
		transactions.addTransaction(new Rental(book2, 1779, 14, 1));
		transactions.addTransaction(new Rental(device1, 2111, 7, 0));
		transactions.addTransaction(new Rental(adapter1, 4965, 7, 1));
		transactions.addTransaction(new Rental(book1, 2643, 14, 8));
		
		System.out.println("Total Rental Costs: $" + transactions.getTotalRentalCosts());
		System.out.println("Total Late Fees: $" + transactions.getTotalLateFees());
	}
}
