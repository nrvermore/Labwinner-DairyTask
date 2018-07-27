package com.demo;

public class Dome1 {

	public static void main(String[] args) {
		int s=0; int sum=0;
		for(int i=1;i<=20;i++){
			for(int j=1;j<i;j++){
				sum=i*j;
				s=s+sum;
	
			}
			
		}
		System.out.println("20的阶乘的值是"+s);
		
	}

}
