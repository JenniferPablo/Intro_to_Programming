/* 
Author: Christina Vinzant
Date: 11/13/2018
5-11
*/
import java.util.Scanner;

class Ex_5_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		
		int num = 100;
		
		while (num <= 200) {
			if (num % 5 == 0 ^ num % 6 == 0) {
				System.out.print(num + " ");
		        count++;
			}
		
			if (count == 10){
				System.out.println();
				count = 0;
			}
			num++;
		}
	}
}