package com.demo;

public class Dome1 {

	public static void main(String[] args) {
		 int sum=0; 
		for(int i=1;i<=20;i++){
			int s=1;
			for(int j=1;j<=i;j++){
			     s*=j;//s=s*j;	
			}
			sum=sum+s;
		}
		System.out.println("20的阶乘的值是"+sum);
	}

}
