//14. 题目：有一个已经排好序的数组。现输入一个数，
//要求按原来的规律将它插入数组中。
package com.day3;

import java.util.Arrays;

public class Dome14 {

	public static void main(String[] args) {
	   int[] arr=new int[]{1,3,5,9,44,55};
	   
	   int s=47;
	   int[] newArr=new int[arr.length+1];
	   Arrays.copyOf(arr, newArr.length);
//	   
	    
	   for(int i=0;i<arr.length;i++){
		   if(arr[i]>s){
			  newArr[i+1] =arr[i];
			  newArr[i]=s;
			   //System.out.print(i);
		   }else if(arr[i]<s){
			   newArr[i]=arr[i];
		   }
		   
	   }
	   for(int i=0;i<newArr.length;i++){
		   System.out.print(newArr[i]+" ");
		   }
	   
	   
	}

}
