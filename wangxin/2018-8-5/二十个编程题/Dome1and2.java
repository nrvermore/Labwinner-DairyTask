//1.题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
//2.题目：利用条件运算符的嵌套来完成此题：学习成绩=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
package com.day3;

import java.util.Scanner;

public class Dome1and2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("请输入一个正整数:");  
    int num = sc.nextInt();
    char grade = num >= 90 ? 'A' :num >= 60 ? 'B' : 'C';
	System.out.println("成绩为"+grade);
    //int num = 90;
    System.out.print(num+"=");
    int i=2;
    while(num>i){
      if(num%i==0){
    	  System.out.print(i+"*");
     	  num=num/i;	  
        }else if(num%i!=0){
      	   i++;
      	   }
       }
    System.out.println(i);
  
	}
	
}
