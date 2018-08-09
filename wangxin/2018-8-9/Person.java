//1、分别写一个重载、重写、和抽象类的demo
//

package com.day9;

public abstract  class Person {
         String name;
         int age;
         String sex;
         
        public void eat(){
        	System.out.print("父类简单的吃饱");
        }
		 abstract void run();
        
         

}
