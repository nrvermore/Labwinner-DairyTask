//多态这章ppt所给的代码重新打一遍,向下转型
package com.day9;
class Animal{
	public void run(){
        System.out.println("animal running...");
	}
}
class Giraffe extends Animal{
	public void run(){
			System.out.println("长颈鹿四条退在跑。。。");}
	public void eat(){
		 System.out.println("长颈鹿在够树叶吃。。。");}
	
}
class camel extends Animal{
	public void run(){
	     System.out.println("骆驼两条腿在跑。。。");}
}

public class TextDown {

	public static void main(String[] args) {
        Animal a=new Giraffe();
        Animal b=new camel();
        print(a);
        print(b);
	
		

	}
	public static void print(Animal a){
		if(a instanceof Giraffe){
			Giraffe g=(Giraffe)a;
			   g.run();;
			   g.eat();
		}
		if(a instanceof camel){
			camel c=(camel)a;
			c.run();
		}
	}

}
