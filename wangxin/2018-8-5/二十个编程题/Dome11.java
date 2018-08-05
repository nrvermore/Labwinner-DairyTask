//题目：给一个不多于5位的正整数，要求：一、求它是几位数，
//二、逆序打印出各位数字。 
package com.day3;

public class Dome11 {

	public static void main(String[] args) {
	String s="12345";
	for(int i=s.length()-1;i>=0;i--){
		System.out.print("逆序打印"+s.charAt(i));
	}
      		System.out.print(s.length()+"位数");
	}

}
