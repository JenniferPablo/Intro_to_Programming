/*
Auther: Christina Vinzant
Date: 2/11/19

finding what lockers are open by using a ray and loop.
*/
import java.util.Scanner;

class Ex_7_23{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean[] cupcake = new boolean[101];
		
		for (int i = 1; i < cupcake.length; i++){
			cupcake[i] = true; } 
			
		for(int i = 2; i <= 100; i++) {
			for(int l = 1; i * l <= 100; l++) {
				cupcake[i * l] = (cupcake[i * l] == true) ? false : true; 
			}
		}
		
		for (int i = 0; i < cupcake.length; i++) {
			if (cupcake[i] == true)
				System.out.println("locker " + i + " is open.");
		}	
	}
		
}