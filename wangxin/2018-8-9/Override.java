package com.day9;

public class Override extends Person {
//重写 
	public void eat(){
		System.out.print("子类很舒服的在吃....");
	}
//重载
	public void eat(String name){
		System.out.println(name+"的在吃....");
	}
//抽象类
	public void run(){
		System.out.println("抽象类在跑....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Override or =new Override();
		or.eat();
		or.eat("sanjin");
		or.run();
		
	}

}
