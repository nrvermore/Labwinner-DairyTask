package com.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



//创建一个List集合对象, 添加20个30以内的随机整数, 并打印输出，
//添加20个30以内的随机整数, 不允许重复.
public class Dome1 {
	

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();  
		Random rand =new Random();
		 for(int i=0;i<=20;i++){
		     int   sc=rand.nextInt(30)+1;
		    
			    if(!list.contains(sc)){
					list.add(sc); 
					
			}}
			    System.out.println("20个随机数"+list);
}}