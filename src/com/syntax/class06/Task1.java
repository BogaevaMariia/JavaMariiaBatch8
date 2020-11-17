package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String country;
		String language;
		
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		
		switch(country) {
		
		
		case "Russia":
			language="Your language is Russian";
			break;
		case "USA":
			language="Your language is English";
			break;
		case "Turkey":
			language="Your language is Turkish";
			break;
		case "Spain":
			language="Your language is Spanish";
			break;
		default:
			language="There isn't such country";
		
		}
		
		System.out.println(language);
		

	}

}
