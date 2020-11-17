package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean allergy=true ;


boolean petAllergy=true;




if (allergy) {
	System.out.println("let's do further check");
	
	if(petAllergy) {
		System.out.println("Please no cat or dog in the house");
	}else {
		System.out.println("that is good");
	}
	
	
	
}else {
	System.out.println("You  are lucky");
}



System.out.println("--------------Example2-----------------");



boolean isFriday=false;
int date=13;

if(isFriday) {
	
	if(date==13){
		System.out.println("I will watch a scary movie");
	}else {
		System.out.println("I will watch PK mowie with Amir Khan");
	}
	
}else {

	System.out.println("Today is not Friday, I am studying");
}


System.out.println("--------------Example3-----------------");
     


int score=65;
boolean assignment=false;

if (assignment) {
	if (score>90) {
		System.out.println("Great job!!!");
	}else if (score>80) {
		System.out.println("Good job!!!");
	}else if (score >70) {
		System.out.println("Try to learn more!!!!");
	}else {
		System.out.println("Good job for trying but yo must study!");
	}
	
	
}else {
	System.out.println("You should allways complete all asssssigments");
}

System.out.println("--------------Example4-----------------");



 boolean diploma=true;
 double gpaScore=3.8;
 
 
 if (diploma) {
	 System.out.println("Congratulations!!!!!!!!!");
	  if (gpaScore>=3.5) {
	 System.out.println("You are eligible for scholarship");
		 
	 }else {
		 System.out.println("You should have studied harder");
	 }
 }else {
	 System.out.println("Studying,studying,studying!!!");
 }

 System.out.println("--------------Example5-----------------");


double morgageRate=3.6;
double morgagePrice=10000;


if (morgageRate<4.5) {
	System.out.println("Let's check the price");
	if(morgagePrice>200000) {
		System.out.println("I need to take a loan");
	}else if (morgagePrice<200000) {
		System.out.println("Take my cashshshshshsh!!!! ");
	}
	
	
	
}else {
	System.out.println("too high morgage rate, we won't buy");
}







	}

}
