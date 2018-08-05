//.题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...
//求出这个数列的前20项之和。
package com.day3;

public class Dome10 {

	public static void main(String[] args) {
		   double sum = 0;
	        double x =2;
	        double y = 1;
	        double sn = 0;
	        for (int i = 0; i <20; i++) {
	            sum += y/x;
	            System.out.println(y+"/"+x);
	            sn = x+y;
	            x = y;
	            y = sn;
	          
	        }
	        System.out.println("总和"+sum);
	    }
	  
}
