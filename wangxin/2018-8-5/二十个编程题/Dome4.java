//.题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
package com.day3;

import java.util.Scanner;

public class Dome4 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		
		char[] ch=s.toCharArray();
		System.out.println("字符串是"+ch);

		int english=0;
		int blank=0;
		int math=0;
		int other=0;
		for(int i=0;i<s.length();i++){
			if(ch[i]>65&&ch[i]<122){
				english++;
				
			}if(ch[i]>48&&ch[i]<57){
				math++;	
			}
			if(ch[i]==32||ch[i]==' '){
				blank++;
				
			}
		}System.out.println("空格是"+blank);
		System.out.println("数字"+math);
		System.out.println("字母"+english);
		
	}

}
