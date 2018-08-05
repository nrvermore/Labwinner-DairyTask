//18.题目：计算字符串中子串出现的次数。
package com.day3;

public class Dome18 {

	public static void main(String[] args) {
	String str="sjfaksfsasbsac";
	String s="sa";
	int count=0;
////	
//	 System.out.println(str.indexOf(s));
//	String ss= str.substring(str.indexOf(s));
//	 System.out.println(ss);
//	 System.out.println(ss.substring(s.length()));
//	String ss2= ss.substring(s.length());
//	 System.out.println(ss2.indexOf(s));
//	 System.out.println(ss2.substring(ss2.indexOf(s)));
	 

	while(true){
		int index = str.indexOf(s);//7
		if(index != -1){
			str = str.substring(index+s.length(), str.length());
			count++;
		}else{
			break;
		}
	}
	
	System.out.println("次数是"+count);
}
	}


