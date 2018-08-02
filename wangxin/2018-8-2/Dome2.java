package com.day2;

import java.util.ArrayList;
import java.util.List;

//某中学有若干学生(学生对象放在一个List中)，每个学生有一个姓名属性(String)、
//班级名称属性(String)和考试成绩属性(double) 某次考试结束后，
//每个学生都获得了一个考试成绩。遍历list集合，并把学生对象的属性打印出来。
 class Student{
	 private String name;
	 private String classname;
	 private double grade;

 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
public Student( String name,String classname,double grade){
	 this.name=name;
	 this.classname=classname;
	 this.grade=grade;
 }
 public String toString()
            {
      return("姓名："+this.name+"，分数为："+this.grade+"，班级名："+this.classname  );
            }
 }
public class Dome2 {

	public static void main(String[] args) {
		List<Student>list =new ArrayList<Student>();
		Student stu1=new Student("铁蛋","一班",88);
		Student stu2=new Student("张三","一班",94);
		Student stu3=new Student("李四","一班",77);
	
		//stu.classname="一班";
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		System.out.println(list.toString()+"\t");
		//stu.run();

	}

}
