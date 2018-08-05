//6. 题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
//利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
//20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；
//60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
//从键盘输入当月利润lirun，求应发放奖金总数sum？
package com.day3;

import java.util.Scanner;

public class Dome6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   System.out.println("请输入利润(万元):");  
	    float num = sc.nextFloat();
	    float sum=0;
	    if(num<=10){
			   sum=(float) (num*0.1);

			   System.out.println("利润"+sum+"万元");
		   }else if(num<=20){
			   sum=(float) ((num-10)*0.075+10*0.1);
			   System.out.println("利润"+sum+"万元");
		   }else if(num<40){
			  sum=(float) ((num-20)*0.5+(num-30)*0.075+1);
			  System.out.println("利润"+sum+"万元");
		   }else if(num<60){
			   num=(float) ((num-40)*0.3+(num-50)*0.075+1);
			   System.out.println("利润"+sum+"万元");
		   }else if(num<=100){
			   num=(float) ((num-60)*0.15+(num-70)*0.075+1);
			   System.out.println("利润"+sum+"万元");
		   }else{
			   num=(float) ((num-100)*0.1+(num-110)*0.075+1);
			   System.out.println("利润"+sum+"万元");
		   }	    
		    }
		
	
}
