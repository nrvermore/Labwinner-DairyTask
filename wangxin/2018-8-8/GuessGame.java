//01.类的成员变量 猜数字游戏一个类A有一个成员变量v有一个初值100。
//定义一个类对A类的成员变量v进行猜。如果大了则提示大了小了则提示小了。等于则提示猜测成功。

package com.day8;

import java.util.Scanner;

class A{
	 final  static int V=100;
}
public class GuessGame   {
    
	public static void main(String[] args) {
	       A a=new A();
	       int num=a.V;
		  // System.out.print(a.V);
	  for(int i=0;;i++){
		 Scanner sc=new Scanner(System.in);
	     int gusee= sc.nextInt();
			   if(num>gusee)
				   System.out.print("猜小了，请继续。。");
			   if(num<gusee)
				   System.out.print("猜大了，请继续。。");
			   if(num==gusee){
				   System.out.print("bingo，猜对了了，。。");
				   break;
		  }
		    
	  }
		 

	}

}
