package com.syntax.class04;

public class IfElseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=9;
int num2=99;
if (num1>num2) {
	System.out.println(num1+" is bigger than "+num2);
}else if (num1<num2) {
	System.out.println(num1+" is smaller than "+num2);
}else {
	System.out.println(num1+" is equal to "+num2);
}


System.out.println("------------------------------");
int day=7;
if(day==1) {
	System.out.println("Today is Monday we have no class");
}else if(day==2) {
	System.out.println("Today is Tuesday we have a manual class");
}else if(day==3) {
	System.out.println("Today is Wednesday we have a manual class again");
}else if(day==4) {
	System.out.println("Today is Thursday we have review class");
}else if(day==5) {
	System.out.println("Today is Friday but Ihave class tommorow and I will prepare");
}else if (day==6) {
	System.out.println("Today is Saturday I miss Java classes");
}else if(day==7) {
	System.out.println("Today is Sunday i did a lot of coding");
}else {
	System.out.println("This is invalid day of the week");
}

}}
