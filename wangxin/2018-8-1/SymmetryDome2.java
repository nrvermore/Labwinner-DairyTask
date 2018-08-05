package com.labwinner.sep.day1;

import java.util.Scanner;


public class SymmetryDome2 {
	
	public static boolean isSymmetry(String ch){
		
		//char[] chr=ch.toCharArray(); 
	for(int i=0; i<ch.length()/2;i++){
			if(ch.charAt(i)!=ch.charAt(ch.length()-i-1)){
				System.out.println("不是的对称数"+ch);
				return false;
			}
			
		}
			System.out.println("是对称数的"+ch);
			return true;

		
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String ch=sc.nextLine();
		
		SymmetryDome2.isSymmetry(ch);
		
		
		

	}

}
