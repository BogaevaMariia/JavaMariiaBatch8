package com.syntax.class04;
import java.util.Scanner;
public class ReplIt {
public static void main(String[]args){
  
  Scanner cream=new Scanner(System.in);
  System.out.println("Please enter 3 distinct numbers ");
  int num1=cream.nextInt();
  int num2=cream.nextInt();
  int num3=cream.nextInt();
  if (num1>num2) {
    if(num1>num3){
      System.out.println("The largest number is "+num1);
    }else if (num2>num1){
    }else if(num2>num3){
      System.out.println("The largest number is "+num2);
    }else if(num3>num1){
    }else if(num3>num2){
      System.out.println("The largest number is "+num3);
    }
}
}
}