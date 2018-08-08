//定义一个接口Compute含有一个方法init computer(int n, int m)。 
//（2）设计四个类分别实现此接口，完成加减乘除运算。 
//（3）设计一个类UseCompute，类中含有方法：public void useCom(Compute com, int one, int two)，
//	此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果。 
//（4）设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算。 

package com.day8;


interface ComInterface { 
public void setComputer(int n, int m);
}
	class add  implements ComInterface {
		@Override
		public void setComputer(int n, int m) {
				System.out.print("做加法运算"+n+"+"+m+"="+(n+m));				
		}	}	
	class subtraction implements ComInterface {
		@Override
		public void setComputer(int n, int m) {	
			System.out.print("做减法运算"+n+"-"+m+"="+(n-m)+"\n");	
		}
	}
	class multiplic implements ComInterface{
		@Override
		public void setComputer(int n, int m) {
			System.out.print("做乘法运算"+n+"*"+m+"="+(n*m));	
		}	
	  }
	class division implements ComInterface{
		@Override
		public void setComputer(int n, int m) {
			// TODO Auto-generated method stub
			System.out.print("做除法法运算"+n+"/"+m+"="+(n/m));	
		}}
	
	class UseCompute {
	
		 public void useCom(ComInterface com, int one, int two){
	             com=new add();
			     com.setComputer(one,two);
			     com=new subtraction();
			     com.setComputer(one, two);
			     // System.out.print(com);
			     com=new multiplic();
			     com.setComputer(one, two);
			    
			     com=new division();
			     com.setComputer(one, two);
			 //System.out.print(com);
		 }
	}
public class Computer1 {
	
	public static void main(String[] args) {
	
     UseCompute user=new UseCompute();
       user.useCom(null, 3, 9);
   
	}

}
