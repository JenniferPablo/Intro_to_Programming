/*
Author: Christina Vinzant
Date: 12/4/2018
Example 6_3
*/
import java.util.Scanner;

class Ex_6_3 {
	public static int reverse(int number) {
		int reverse = 0;
		int remain = 0;
		
		while (number != 0) {
			remain = number % 10;
			reverse = reverse * 10 + remain;
			number /= 10;
		}
		return reverse;
	}
	
	public static boolean isPalindrome(int number) {
		boolean isPalindrome = false;
		int same = reverse(number);
		
		if (same == number) {
			isPalindrome = true;
		}
		return isPalindrome;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user = 0;
		
		System.out.print("Enter a number: ");
		user = input.nextInt();
		
		System.out.println("Is " + user + " a palindrome? " + isPalindrome(user));
	}
}