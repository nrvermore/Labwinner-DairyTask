package com.labwinner.sep.day1;

import java.util.Scanner;

//在歌唱比赛中，共有10位评委进行打分，在计算歌手得分时，
//去掉一个最高分，去掉一个最低分，然后剩余的8位评委的分数进行平均，就是该选手
public class Demo5 {
	

	public static int[] Max(int[] grade){
		float sum=0; 
	    float max=grade[0]; 
	    for(int i=0;i<grade.length;i++){
	    	if(grade[i]>max){
	    		max=grade[i];
	    	}
	    	
	    }
	    System.out.println("max"+max);
	    float min=grade[0];
	    for(int i=1;i<grade.length;i++){
	    	if(grade[i]<min){
	    		min=grade[i];
	    		
	    	}
	    	
	    }
	    System.out.println("min"+min);
		for(int i = 0; i<grade.length ; i++){
		if(grade[i]!=min&&grade[i]!=max){
			 sum=(sum+grade[i])/(grade.length-2);
			
			}
		
		}
		 System.out.println("10个评委的最后评分"+sum);
		return grade;
	}
	

	public static void main(String[] args) {
		int[] grade={9,6,8,7,9,10,7,5,6,7};
		Demo5.Max(grade);
		
		

	}

}
