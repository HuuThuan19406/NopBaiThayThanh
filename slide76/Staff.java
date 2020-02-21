package slide76;

import java.util.ArrayList;

public class Staff {
	ArrayList<StaffMember> staffList=new ArrayList<StaffMember>();
	
	public void add(StaffMember member) {
		staffList.add(member);
	}
	
	public void showAll() {
		for (StaffMember member : staffList) {
			System.out.println(member.toString());
			System.out.println("----------------------");
		}
	}
}
