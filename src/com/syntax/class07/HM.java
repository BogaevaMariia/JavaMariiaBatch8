package com.syntax.class07;

import java.util.Scanner;

public class HM {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Please enter 2 numbers");
		 
		 double num1=input.nextDouble();
		 double num2=input.nextDouble();
		 
		 System.out.println("Please enter the Math operation +, -, *, /");
		 char Operation= input.next().charAt(0);
		 
		 double result=0;
		 
		 switch(Operation){
		 case '+':
			 result=(num1+num2);
			 break;
		 case '-':
			 result=(num1-num2);
			 break;
		 case '*':
			 result=(num1*num2);
			 break;
		 case '/':
			 result=(num1/num2);
			 break;
			 default:
				 System.out.println("Error");	 		 
		 }
		if (result !=0) {
			System.out.println("The resault is = "+ result);
		}

	}

}
