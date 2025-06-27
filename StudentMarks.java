package day4;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Mark:");
		int mark = sc.nextInt();
		if(mark>=35 && mark<=100) {
			System.out.println("You have Passed");
		}
		else if(mark<0 || mark>100){
			System.out.println("Invalid mark");
		}
		else {
			System.out.println("You have Fail");
		}
		
		
		
	}

}
