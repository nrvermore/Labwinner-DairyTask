
//19.题目：海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子平均分为五份，
//多了一个，这只猴子把多的一个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，
//它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
package com.day3;

public class Dome19 {

	public static void main(String[] args) {
		 
		 
		 System.out.println(s(10));
		 
	}
	static int s(int i){//绝佳的一个代码。。。
		int u=i;
		for(int x=0;x<5;x++){
			if(i%5!=1)
				return s(u+1);
			i=(i-1)/5*4;
		}
		return u;
	}
}
