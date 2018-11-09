/*
Author: Christina Vinzant
Date: 10/26/2018
Exercise 3-3
*/
import java.util.Scanner;

class Ex_3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a,b,c,d,e,f,x,y = 0.0;
		System.out.println("Enter a: ");
		a = input.nextDouble();
		System.out.println("Enter b: ");
		b = input.nextDouble();
		System.out.println("Enter c: ");
		c = input.nextDouble();
		System.out.println("Enter d: ");
		d = input.nextDouble();
		System.out.println("Enter e: ");
		e = input.nextDouble();
		System.out.println("Enter f: ");
		f = input.nextDouble(); 
		
		System.out.println( x = (e * d - b * f) / (a * d - b * c));
		System.out.println( y = (a * f - e * c) / (a * d - b * c));
		
		if (a * d - b * c == 0)  {
			System.out.println("The equation has no solution");
		}
		
	}
}