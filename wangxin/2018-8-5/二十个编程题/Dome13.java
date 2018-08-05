//题目：对10个数进行排序。
package com.day3;
import java.util.Arrays;


public class Dome13 {

	public static void main(String[] args) {
		int[] arr={8,23,1,22,3,4,6,15,25};
//		int temp;
//		for (int i = 0; i < arr.length-1; i++) {
//		for (int j = i+1; j < arr.length; j++) {
//		//这里用从小到大的排序方式,因此当arr[i]大于arr[j]时进行值互换
//		if (arr[i]>arr[j]) {
//		temp=arr[i];
//		arr[i]=arr[j];
//		arr[j]=temp;
//		     }
//		    }
//		
//		   }
//		
//		
//
//		   
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			}
	}

}
