package day6;

import java.util.Scanner;

public class TrafficCaluculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vehicle type (2 for 2-wheeler or 4 for 4-wheeler): " );
		int num = sc.nextInt();
		
		if(num==2) {
			System.out.println("Enter your speed: " );
			int num1 = sc.nextInt();
			System.out.println("Enter speed limit: ");
			int num2 = sc.nextInt();
			int a = num1 - num2;
			System.out.println("over speed !");
			if(a>=1 && a<10) {
				System.out.println("Fine =  ₹500");
			}
			else if(a>=10 && a<20) {
				System.out.println("Fine =  ₹1000");
			}
			else if(a>=20)
			{
				System.out.println("Fine =  ₹2000");
			}
			else
			{
				System.out.println("No fine. Drive safely!");
			}
			
		}
		else if(num==4) {
			System.out.println("Enter your speed: " );
			int num1 = sc.nextInt();
			System.out.println("Enter speed limit: ");
			int num2 = sc.nextInt();
			int a = num1 - num2;
			System.out.println("over speed !");
			
			if(a>=1 && a<10) {
				System.out.println("Fine = ₹1000");
			}
			else if(a>=10 && a<20) {
				System.out.println("Fine = ₹2000");
			}
			else if(a>=20)
			{
				System.out.println("Fine = ₹3000");
			}
			else
			{
				System.out.println("No fine. Drive safely!");
			}
			
		}
		else
		{
			System.out.println("Please Enter correct Type");
			
		}
		
	}

}
