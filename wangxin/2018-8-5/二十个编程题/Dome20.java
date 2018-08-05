
//20. 题目：字符串排序。
//（利用容器类中Collections的sort方法）
package com.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dome20 {

	public static void main(String[] args) {
	//	int [] arr = new int[]{1,22,3,44,4,55,2};
		List<String> list=new ArrayList<>(); 
		list.add("5");
		list.add("2");
		list.add("77");
		list.add("33");
		System.out.println("排序前"+list+" ");
		Collections.sort(list);
		System.out.print("排序后"+list+" ");
	
	}

}
