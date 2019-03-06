/*
Author: Christina Vinzant
Date: 2/22/19

programs sum two 3x3 matrices
*/

import java.util.Scanner;

public class Ex_8_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double chango [][] = new double[3][3];
		double oso [][] = new double[3][3];
		double[][] oreos = new double[3][3];
		
		for (int i = 0; i < 3; i++){
			System.out.print("Enter 3 numbers for row " + (i + 1) + " for Matrix A: ");
			
			for (int col = 0; col <= 2; col++){
				chango[i][col] = input.nextDouble();
			}
		}
			
		for (int row = 0; row < 3; row++) {
			System.out.print("Enter 3 numbers for row " + (row + 1) + " for Matrix B: ");
			
			for (int col = 0; col <= 2; col++) {
				oso[row][col] = input.nextDouble();
			}
		}
		
		oreos = addMatrix(chango, oso);
		
		for (int row = 0; row < oreos.length; row++) {
			
			for (int col = 0; col < oreos[0].length; col++) {
				
			
			System.out.print(oreos[row][col] + " ");
		}
}
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
		
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[0].length; col++) {
				c[row][col] = a[row][col] + b[row][col];
			}
		}
		
		return c;
		
	}
}