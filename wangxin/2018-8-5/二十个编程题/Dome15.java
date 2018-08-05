//题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
package com.day3;

public class Dome15 {

	public static void main(String[] args) {
	int [] arr =new int[]{2,5,1,77,4,6,8,8};
	int max=arr[0];
	int min=arr[0];
	int maxindex=0;
	int minindex=0;
	for(int i=0;i<arr.length-1;i++){
		if(arr[i]>max){   
			  max=arr[i];
			  maxindex=i;
			  
		}
		if(arr[i]<min){
			min=arr[i];
			minindex=i;
		}
		
		
	}
	  arr[maxindex]=arr[0];
	  arr[minindex]=arr[arr.length-1];
	  arr[0]=max;
	  arr[arr.length-1]=min;
	  for(int i=0;i<arr.length;i++){
		   System.out.print(arr[i]+" ");
		   }
	}

}
