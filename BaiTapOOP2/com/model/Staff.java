package BaiTapOOP2.com.model;

public class Staff {
	private String firstName, lastName;
	private int totalProducts;
	private final double 
	Salary199=0.5, Salary399=0.55, Salary599=0.6, Salary600Up=0.65;			
	public Staff(String firstName, String lastName, int totalProducts)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		if (totalProducts<0)
			totalProducts=0;
		this.totalProducts=totalProducts;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public int getTotalProducts()
	{
		return totalProducts;
	}
	/**
	 * Procedure to setting values
	 * @param Option Assign '1' for Option variable if you want to change firstName value, else it will change lastName value
	 * @param Name Value need be changed
	 */
	public void set(int Option, String Name)
	{
		if (Option==1)
			this.firstName=Name;
		else 
			this.lastName=Name;
	}
	public void set(int totalProducts)
	{
		this.totalProducts=totalProducts;
	}
	public boolean Bigger(Staff varStaff)
	{
		if (this.totalProducts>varStaff.getTotalProducts())
			return true;
		else 
			return false;
	}
	public double getSalary()
	{
		int totalProducts=this.totalProducts;
		if(totalProducts<=199)
			return totalProducts*Salary199;
		else 
			if(totalProducts<=399)
				return 199*Salary199+(totalProducts-199)*Salary399;
			else
				if(totalProducts<=599)
					return 199*Salary199+200*Salary399+(totalProducts-399)*Salary599;
				else
					return 199*Salary199+200*Salary399+200*Salary599+(totalProducts-599)*Salary600Up;		
	}
}
