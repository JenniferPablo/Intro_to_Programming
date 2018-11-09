/*
Author: Christina Vinzant
Date: 11/7/2018
Exericse 3-23
*/
import java.util.Scanner;

class Ex_3_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double point = 0.0;
		
		
		System.out.println("Enter x: ");
		double x = input.nextDouble();
		System.out.println("Enter y: ");
		double y = input.nextDouble();
		
		if (x <= 5 && x >= -5 && y <= 2.5 && y >= -2.5) {
			System.out.println("Is in the rectangle");
		}
		else {
			System.out.println("Is not in the rectangle");
		  
		}
	}
}