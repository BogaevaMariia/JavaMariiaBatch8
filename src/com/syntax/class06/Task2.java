package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	
		public static void main (String[] args) {
			
			Scanner marks=new Scanner(System.in);
			String grade;
			String explanation;
			
			System.out.println("Please enter your grade");
			grade=marks.nextLine();
			
			
			switch(grade) {
			
			case "A":
				explanation="Excellent";
				break;
			case "B":
				explanation="Good";
				break;
			case "C":
				explanation="Average";
				break;
			case "D":
				explanation="Bad";
				break;
				default:
					explanation="Not acceptable";
			}
				System.out.println(explanation);
			
			
			

	}

}
