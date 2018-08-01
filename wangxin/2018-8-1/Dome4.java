package com.labwinner.sep.day1;
//2、快速找出一个数组中的最大数、第二大数。



public class Dome4 {
	public static  int[] Max(int[] arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
				
			}	
			
	    }
		   System.out.print("最大"+max);
		 int secondmax=arr[0];  
		 for(int j=0;j<arr.length;j++){
			 if(arr[j]>secondmax&&arr[j]<max){
				 secondmax=arr[j];
				 
			 }
		 }System.out.print("第二大"+secondmax);
		return arr;
		}
	public static void main(String[] args) {
		int[] arr = {1,3,4,55,4,7,6,8,5};
		//arr = Max(arr);
		Dome4.Max(arr);			
				}
				

}
