package Library;

public class Rental {
	private Item rentedItem;
	private int customerID;
	private int rentalDays;
	private int lateDays;
	
	public Item getRentedItem() {
		return rentedItem;
	}
	public Rental(Item rentedItem, int customerID, int rentalDays, int lateDays) {
		this.rentedItem = rentedItem;
		this.customerID = customerID;
		this.rentalDays = rentalDays;
		this.lateDays = lateDays;
	}
	public void setRentedItem(Item rentedItem) {
		this.rentedItem = rentedItem;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getRentalDays() {
		return rentalDays;
	}
	public void setRentalDays(int rentalDays) {
		this.rentalDays = rentalDays;
	}
	public int getLateDays() {
		return lateDays;
	}
	public void setLateDays(int lateDays) {
		this.lateDays = lateDays;
	}
}
