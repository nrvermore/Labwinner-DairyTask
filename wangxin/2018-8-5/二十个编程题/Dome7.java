//7.题目：一个整数，它加上100后是一个完全平方数
//，加上168又是一个完全平方数，请问该数是多少？//
package com.day3;

public class Dome7 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			double x = Math.sqrt(i + 100);
			double y = Math.sqrt(i + 268);
			if (x == (int) x && y == (int) y) {
			System.out.println("这个数是:" + i);
				continue;
			}
			
		}
	
	}

}
