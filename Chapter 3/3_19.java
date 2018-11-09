/*
Author: Christina Vinzant
Date: 11/1/2018
Exericse 3-19
*/
import java.util.Scanner;

class Ex_3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double perimeter = 0.0;
		
        System.out.println("Enter side1: ");
		double side1 = input.nextDouble();
        System.out.println("Enter side2: ");
 		double side2 = input.nextDouble();
        System.out.println("Enter side3: ");
		double side3 = input.nextDouble();
        
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
	    	perimeter = (side1 + side2 + side3); 
			System.out.println("perimeter; " + perimeter);
			
		}
        else {
			System.out.println("Invalid");	
		}
	}
}