package Library;

public class Adapter extends Device{

	public Adapter(Adapter adapter) {//copy constructor
		super(adapter.getName(), adapter.getRentalCost());
	}
	
	public Adapter(double rent) {//manual constructor
		super("Adaptor", rent);
	}

	@Override
	public double getLateFee(int daysLate) {
		double fee = 2.5*(double)daysLate + this.getRentalCost()*0.15;
		return fee;
	}
	
	@Override
	public String toString() {
		String info = "Rental Cost: $" + this.getRentalCost() + "\n";
		info += "Adapter ID: " + this.getID() +"\n";
		info += "Type of Device: Adaptor\n\n"; //type is known
		
		return info;
	}

}
