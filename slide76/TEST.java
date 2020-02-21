package slide76;

public class TEST {

	public static void main(String[] args) {
		Employee employee=new Employee("Tester","PC","4938");
		employee.setSocialSecurityNumber("1234");
		employee.setPayRate(0.5);
		Staff staff =new Staff();
		staff.add(employee);
		
		Hourly hourly =new Hourly("Testing","Laptop","8394");
		hourly.setHoursWorked(5);
		hourly.addHours(3);
		staff.add(hourly);
		
		staff.showAll();
	}

}
