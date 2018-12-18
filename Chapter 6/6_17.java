/*
Author: Christina Vinzant
Date: 12/6/2018
Example 6_17
*/
import java.util.Scanner;

class Ex_6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user = 0;
		
		System.out.print("Enter n: ");
		user = input.nextInt();
		
		printMatrix(user);
	} 
	
	public static void printMatrix(int n){
		for(int rows = 0; rows < n; rows++) {
			System.out.println();
			for(int columns = 0; columns < n; columns++) {
				System.out.print((int)(Math.random() * 2) + " ");	
			}
		}
	}
}