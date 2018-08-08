//03.构造方法与重载 为“无名的粉”写一个类class WuMingFen 
//要求： 1.有三个属性 面码:String theMa 粉的分量(两) int quantity 是否带汤 boolean likeSoup 
//2.写一个构造方法 以便于简化初始化过程 如 WuMingFen f1 = new WuMingFen("牛肉",3,true);
//3.重载构造方法 使得初始化过程可以多样化 WuMingFen f2 = new WuMingFen("牛肉",2); 
//4.如何使得下列语句构造出来的粉对象是酸辣面码、2两、带汤的 WuMingFen f3 = new WuMingFen();
//5.写一个普通方法 check() 用于查看粉是否符合要求。即 将对象的三个属性打印在控制台上。

package com.day8;

public class WuMIngFen {
	String mianfen;
	int quantity;
	boolean likeSoup;
	public WuMIngFen(String mianfen,int quantitly,boolean likeSoup){
		this.mianfen=mianfen;
		this.quantity=quantitly;
		this.likeSoup=likeSoup;
		
	}
	public WuMIngFen(String mianfen,int quantitly){
		this.mianfen=mianfen;
		this.quantity=quantitly;
		
		
	}
	public WuMIngFen(){
		
		
	}
	public WuMIngFen(int quantity){
		this.quantity=quantity;
		check();
		
	}
	public void check(){
		if( quantity<2){
			System.out.println("粉的量不足2量，请添其量够");
		}else 
			System.out.println("粉的量足2量，请放心吃吧。。");
	}

	public static void main(String[] args) {
		WuMIngFen fen=new WuMIngFen("牛肉",3,true);
		System.out.println(fen.mianfen+fen.quantity+fen.likeSoup);
		WuMIngFen f2 = new WuMIngFen("牛肉",2); 
		System.out.println("重载后的值"+" "+f2.mianfen+f2.quantity);
		WuMIngFen f3 = new WuMIngFen();
		f3.mianfen="酸辣粉";
		f3.quantity=3;
		f3.likeSoup=true;
		System.out.println("无参的构造"+""+f3.mianfen+f3.quantity+f3.likeSoup);
		WuMIngFen f4 = new WuMIngFen(4);
	}

}
