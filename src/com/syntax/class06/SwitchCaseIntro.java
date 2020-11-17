package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan=new Scanner(System.in);
 int day= scan.nextInt();
 String myDay;
 String today;
 
 
 
 switch(day) {
 
 case 1:
	 today="Monday";
	 break;
	 
 case 2:
	 today="Tuesday";
	 break;
	 
 case 3:
	 today="Wednesday";
	 break;
	 
 case 4:
	 today="Thursdayy";
	 break;
	 
 case 5:
	 today="Friday";
	 break;
	 
 case 6:
	 today="Saturday";
	 break;
	 
 case 7:
	 today="Sunday";
	 break;

	 default:
		 today="Invalid day";
		 
	 
	 
 }
 

 
 
	}

}
