package slide76;

public class Hourly extends Employee {
	private int hoursWorked;
	
	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public Hourly() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hourly(String name, String address, String phone) {
		super(name, address, phone);
		// TODO Auto-generated constructor stub
	}

	public void addHours(int moreHours) {
		System.out.println("Total hours worked is "+(hoursWorked+moreHours));
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+hoursWorked+"h";
	}
	
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return super.pay();
	}
}
