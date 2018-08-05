//题目：求s = a + aa + aaa + aaaa + aa...a的值，其中a是一个数字。
//例如2 + 22 + 222 + 2222 + 22222(此时共有5个数相加)，几个数相加有键盘控制。
package com.day3;

import java.util.Scanner;

public class Dome5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	       int num = s.nextInt();
	       int a= s.nextInt();
	       int sum=0;
	       int ss=0;
	       for(int i=0;i<num;i++)
	       {
	    	   sum+=a*Math.pow(10, i);//sum=sum+a.Math.pow(10,i)
	    	   System.out.println(sum+"\t");
	    	  // ss=sum;
	    	   ss+=sum;
	       }
	       System.out.println(ss);
	       
	      
	}

}
