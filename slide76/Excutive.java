package slide76;

public class Excutive extends Employee {
	private double bonus;
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Excutive() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Excutive(String name, String address, String phone) {
		super(name, address, phone);
		// TODO Auto-generated constructor stub
	}

	public void arwadBonus(double excBonus) {
		
	}
	
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return super.pay();
	}
}
