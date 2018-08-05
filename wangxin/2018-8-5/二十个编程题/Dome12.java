//12. 题目：一个5位数，判断它是不是回文数。
//即12321是回文数，个位与万位相同，十位与千位相同。
package com.day3;

import java.util.Scanner;

public class Dome12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int number=sc.nextInt();
		  int a=number/10000;
		  int b=number/1000%10;
		  int c=number/100%10;
		  int d=number/10%10;
		  int e=number%10;
		  if(a==e && b==d){
		   System.out.println(number+"是回文数");
		  }else{
		   System.out.println(number+"不是回文数");
		  }
		 }

	

}
