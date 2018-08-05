//8. 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
package com.day3;

import java.util.Scanner;

public class Dome8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	        int a = s.nextInt();
	        int b = s.nextInt();
	        int c = s.nextInt();
	        System.out.print("最大值"+sort(a,b,c));

	}
	public static int sort(int a,int b,int c){
	   for(int i=0;i<3;i++){
		   if(a>b){
			   int temp=a;a=b;b=temp;
		   }if(a>c){   
		   }if(b>c){
			   int temp=b;b=c;c=temp;
		   }
		  
	   } 
	   System.out.println("从小到大的顺序"+a+""+b+""+c);

	
		return c;
		
	} 

}
