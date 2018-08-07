package com.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class sortDome {
	 //static ArrayList<Object> list;

	public static void main(String[] args) {
	List<Student>list=new ArrayList<Student>();  	
		Random rand =new Random();
		 for(int i=20070301;i<=20070330;i++){
		     int   sc=rand.nextInt(41)+ 59;//rand.nextInt(MAX - MIN + 1) + MIN; // randNumber 
		          list.add(new Student(i,sc));                          // 将被赋值为一个 MIN 和 MAX 范围内的随机数
		 
		 }
		
	    // System.out.print("30个同学成绩数"+list);
	   
		 
		 
		 Collections.sort(list,new  Comparatorstudent());
	     for(Student stu:list){
	    	 System.out.println(stu);
	       }}
	    
		 
		
}
class Comparatorstudent implements Comparator<Student>{
	 
		@Override
		public int compare(Student s1, Student s2) {
			if(s1.getGrade()>s2.getGrade()){
	    		return 1;
	    	}
	    	if(s1.getGrade()<s2.getGrade()){
	    		return -1;
	    	}			
			return 0;		
		}
}
class Student  {
	private int sno;
	public static final  String  course="java";
	private int grade;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	

	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sno,int grade){
		this.sno=sno;this.grade=grade;
	}
	public String toString() {
		return "Student [学号=" + sno + ", 班级=" + course + ", 成绩=" + grade + "]"  +"\n";

	}

//	Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
//		    public int compare(Map.Entry<String, String> mapping1, Map.Entry<String, String> mapping2) {
//		        return mapping1.getKey().compareTo(mapping2.getKey());
//		    }
//		});
	


}