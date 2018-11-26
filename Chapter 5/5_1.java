/* 
Author: Christina Vinzant
Date: 11/15/2018
5-1
*/

import java.util.Scanner;
class Ex_5_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int postive = 0;
		int negative = 0; 
		int sum = 0;
		int user = 0;
		System.out.println("Enter a positive or negative number");
		user = input.nextInt();
		
		do {
			if (user > 0){
				postive++;
			}
			else {
				negative++;
			}
			sum+= user;
			
			System.out.println("Enter a postive or negative number (0 to quit)");
			user = input.nextInt();
			
		} while (user != 0);
		System.out.println("positive numbers: " +postive);
		System.out.println("negative numbers: " +negative);
		System.out.println("sum of numbers: " +sum);
	}

		
}