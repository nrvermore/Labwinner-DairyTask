//3.题目：输入两个正整数m和n，求其最大公约数和最小公倍数。

package com.day3;

import java.util.Scanner;

public class Dome2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		       int m = s.nextInt();
		        int n = s.nextInt();
		        
		        System.out.println("最大公约数:"+Max(m, n));
		         System.out.println("最小公倍数:"+Min(m, n));
		   
		
	}
	public static int Max(int m,int n){
		if(m<n){
			int temp=m;m=n;n=temp;		
		}
		if(m%n==0){
			return n;
		}else
			return Max(n,m%n);

	}
	public static int Min(int m,int n){
	
		return n*m/Max(m,n);//最小公倍数很容易求得.是m和n的乘积再除以最大公约数
		
	}

}
