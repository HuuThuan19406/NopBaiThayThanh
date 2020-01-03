package BaiTapOOP2.com.model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			String firstName, lastName;
			int n, totalProducts;
			Staff[] list=new Staff[2];
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter total staffs: ");
			n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				System.out.println("Staff"+(i+1)+"'s information");
				System.out.print("First name: ");
				firstName=sc.next();
				System.out.print("Last name: ");
				lastName=sc.next();
				System.out.print("Total Products: ");
				totalProducts=sc.nextInt();
				list[i]=new Staff(firstName, lastName, totalProducts);
			}
			System.out.println("\t\tList Staffs");
			System.out.println("-----------------------------------");
			for(Staff object:list)
			{
				System.out.println(object.getLastName()+' '+object.getFirstName());
				System.out.println("Total Products: "+object.getTotalProducts()+"\tSalary: "+object.getSalary());
				System.out.println("-----------------------------------");
			}
			System.out.println("Compare total products between Staff1 and Staff2");
			System.out.print("People that have total products more is: ");
			//Using procedure Bigger
			if(list[0].Bigger(list[1]))
				System.out.println(list[0].getLastName()+' '+list[0].getFirstName());
			else
				System.out.println(list[1].getLastName()+' '+list[1].getFirstName());
			//Not using procedure Bigger
			if(list[0].getTotalProducts()>list[1].getTotalProducts())
				System.out.println(list[0].getLastName()+' '+list[0].getFirstName());
			else
				System.out.println(list[1].getLastName()+' '+list[1].getFirstName());
			System.out.println("Distance: "+Math.abs(list[0].getTotalProducts()-list[1].getTotalProducts()));
		} catch (Exception e) {
			System.err.println("Sorry! Anything made errors. Program will close and clear.");
		}
	}
}
