
package com.day30;

import java.util.Scanner;
public class Dome3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("�������һ����");
		int a=s.nextInt();
		System.out.print("������Ӽ��˳�����");
		Scanner s2=new Scanner(System.in);
		String sc=s2.next();
		char c=sc.charAt(0);
		System.out.print("������ڶ�����");
		Scanner s1=new Scanner(System.in);
		int b=s1.nextInt();
	   
		  System.out.print(c);//��ӡ�ж�c�ַ��ܷ����������
		  if(c=='+'){
			  System.out.println("���֮���ֵΪ"+(a+b));
		  }else if(c=='-'){
			  System.out.println("�����ֵΪ"+(a-b));
		  }else if(c=='*'){
			  System.out.println("��˵�ֵΪ"+(a*b));
		  }else if(c=='/'){
			  System.out.println("�����ֵΪ"+(a/b));
		  }
		s2.close();
		s.close();
		s1.close();
		

	}

}
