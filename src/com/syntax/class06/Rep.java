package com.syntax.class06;

import java.util.Scanner;

public class Rep {

	public static void main(String[] args) {
		
		  Scanner scan= new Scanner(System.in);
		  
		  String carOrigin;
		  String car;
		  
		  System.out.println("Please enter your favorite car make");
		  carOrigin=scan.nextLine();
		  
		  switch(carOrigin){
		  case "BMW":
			  car="german car";
			  break;
		  case "Toyota":
			  car="japanese car";
			  break;
		  case "Maserati":
			  car="italian car";
			  break;
		      default:
			  car="unknown";
			 
		      
		        } 
		        System.out.println("Your favourite car is "+car);
		        
		  
		

	}

}
