package com.day6;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class setSortDome2 {
	public static void main(String[] args) {
		Set<Student> set=new TreeSet<Student>();
		Random rand =new Random();
		 for(int i=20070301;i<=20070330;i++){
			int sc= rand.nextInt(41) +59;
			Student s1=new Student();
			s1.grade=sc;
			s1.sno=i;
			 set.add(s1); 
		 }
		 Iterator it=set.iterator();
		 while(it.hasNext()){
		   System.out.print(it.next());    
		 }
	
		 

	}
	static class Student implements Comparable<Student>{
	     int sno;
		 static final String course="java";
		 int grade;
	
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Student(int sno,int grade){
			this.sno=sno;
			this.grade=grade;
		}
		public String toString(){
			
			return"Student [学号=" + sno + ", 班级=" + course + ", 成绩=" + grade + "]"  +"\n";
			
		}

		@Override
		public int compareTo(Student s1) {
			if(this.grade>s1.grade)
				return 1;
			 if(this.grade<s1.grade)
				return -1;
			if(this.grade==s1.grade){
				if(this.sno>s1.sno){
					return 1;	
				}else{
					return -1;	
				}
			}
				return 0;	
		}	
	}
//	class Comparatorstudent implements Comparator<Student>{
//	
//		@Override
//		public int compare(Student s1, Student s2) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
	//}
	
	

}
