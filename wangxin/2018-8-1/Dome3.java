package com.labwinner.sep.day1;

import java.util.Arrays;

public class Dome3 {

	
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		arr = clearZero(arr);
		System.out.println("数组的元素："+Arrays.toString(arr));
		}
	
		public static  int[] clearZero(int[] arr){
			//统计0的个数
			int count = 0;	//定义一个变量记录0的个数
			for(int i = 0 ; i<arr.length ; i++){
				if(arr[i]==0){
					count++;
				}
			}
			//创建一个新的数组
			int[] newArr = new int[arr.length-count];
			
			int index  =0 ; 
			//把非的数据存储到新数组中。
			for(int i = 0; i<arr.length ; i++){
				if(arr[i]!=0){
					newArr[index] = arr[i];
					index++;
				}
			}
			return newArr;
		
	}
		

}
