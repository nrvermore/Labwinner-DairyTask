//04.构造方法与重载、包 编写Addition类该类中应包含一组实现两数相加运算的重载方法。 
//实现加法运算的方法 应接受两个参数 即加数和被加数 方法将两个参数进行加法运算后 返回相加结果。
//考虑可能针对不同的数据类型进行计算 重载一组方法 包括整型、长整型、浮点型、双精度浮点型、还有字符串。 
//在main方法中创建Addition类的实例 分别调用重载方法测试其效果。
//应将Addition类打入到包中 以自己名字的拼音为包命名。


package com.day8;

public class Addition {
	public int add(int num1,int num2){
		System.out.println(num1+num2);
	   return num1+num2;
	   
	      }
	public float add(float num1,float num2){
		System.out.println(num1+num2);
	    	return num1+num2;
		  }
	public long add(long num1,long num2){
		System.out.println(num1+num2);
    	return num1+num2;
	  }
	public double add(double num1,double num2){
		System.out.println(num1+num2);
    	return num1+num2;
	  }
	public String add(String num1,String num2){
		System.out.println(num1+num2);
    	return num1+num2;
	  }


	public static void main(String[] args) {
      	Addition addition=new Addition();
      	addition.add(2, 4);
      	addition.add(3.2, 4.5);
      	addition.add(2.4, 5.5);
      	addition.add(33333, 666666666);
      	addition.add("hello", "world");
      	
//		Addition fadd=new Addition(7,8);

	}

}
