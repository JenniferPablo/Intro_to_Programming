/*
Author: Christina Vinzant
Date: 02/28/2019

Write a program that repeatedly prompts the user to enter a capital for a state.
*/
import java.util.Scanner;

class Ex_8_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[][] quiz = monkey();
		
		int size = 0; 
		
		for(int i = 0; i < quiz.length; i++) {
			System.out.println("What is the captial of " + quiz[i][0] + "? ");
			
			String statesAndcapitals = input.nextLine();
			
			
			
			if (isEqual(quiz[i][1], statesAndcapitals)) {
				System.out.println("Your answer is correct");
				size++;
			}
			else {
					System.out.println("Your answer is wrong, the right answer is " + quiz[i][1]);
			}
		}
		System.out.println("Your score is " + size + " out of 10");
		
		if (size >= 6 ) {
			System.out.println("   ---Good Job!!---   ");
		}
			else {
				System.out.println("  ---Better luck next time--- ");
			}
	}
	public static boolean isEqual(String question, String number) {
		if (question.length() != number.length())
			return false;
			
		for (int i = 0; i < question.length(); i++) {
			if (question.charAt(i) != number.charAt(i))
				return false;
		}
		return true;
	}
	public static String[][] monkey() {
		String[][] answer = {
			{"Indiana", "Indianapolis"}, {"Massachusetts", "Boston"}, {"Mississippi", "Jackson"}, {"Nebraska", "Licoln"}, {"New York", "Albany"}, {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"}, {"Rhode Island", "Providence"}, {"Wisconsin", "Madison"}, {"New Mexico", "Santa Fe"}};
			return answer;
		}
	}
