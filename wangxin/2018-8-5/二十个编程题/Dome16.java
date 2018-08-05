//有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
package com.day3;

import java.util.Scanner;

public class Dome16 {

	public static void main(String[] args) {
//		12345  2  
//          12345
//          45321
		
		int []arr=new int[]{1,2,3,4,5};
		System.out.print("请向后移动多少长度");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int []newArr=new int[arr.length];
		for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            int tmp = (i + m) % 5;// 计算新的位置
             arr[tmp]=newArr[i];
        }  System.out.print("移动 " + m + " 个位置后，数组变为：");
		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
		
	}

}
