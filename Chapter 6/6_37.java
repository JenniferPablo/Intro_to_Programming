/*
Author: Christina Vinzant
Date: 12/10/2018
Example 6_37
*/
import java.util.Scanner;

class Ex_6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user = 0; 
		int width = 0;
		
		System.out.println("Enter a number: ");
		user = input.nextInt();
		
		System.out.println("Enter a width: ");
		width = input.nextInt();
		
		System.out.println(format(width, user) );
		
	}
	public static String format(int width, int number) {
		int size = 0;
		int num = number;
		while (num > 0) {
			size += 1;
			num = num / 10;
		}
		String variable = "";
		
		if(size > width) {	
			variable = Integer.toString(number);
			
		}
		else {
			
			for (int i = width - size; i > 0; i--) {
				variable = variable + "0";
			}
			variable = variable + number;
		}
		return variable; 		
	}
}