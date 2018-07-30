
package com.day30;

import java.util.Scanner;
public class Dome3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("请输入第一个数");
		int a=s.nextInt();
		System.out.print("请输入加减乘除符号");
		Scanner s2=new Scanner(System.in);
		String sc=s2.next();
		char c=sc.charAt(0);
		System.out.print("请输入第二个数");
		Scanner s1=new Scanner(System.in);
		int b=s1.nextInt();
	   
		  System.out.print(c);//打印判断c字符能否正常输出。
		  if(c=='+'){
			  System.out.println("相加之后的值为"+(a+b));
		  }else if(c=='-'){
			  System.out.println("相减的值为"+(a-b));
		  }else if(c=='*'){
			  System.out.println("相乘的值为"+(a*b));
		  }else if(c=='/'){
			  System.out.println("相除的值为"+(a/b));
		  }
		s2.close();
		s.close();
		s1.close();
		

	}

}
