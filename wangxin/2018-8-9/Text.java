//多态这章ppt所给的代码重新打一遍
package com.day9;

class Water{
    public void showTem(){
        System.out.println("我的温度是: 15度");
    }
}
class IceWater extends Water{
    public void showTem( int c){
        System.out.println(c+"我的温度是: 0度");
    }

}
class HotWater extends Water{
    public void showTem(String hot){
        System.out.println(hot+"我的温度是:100度");
    }

}

public class Text {

	public static void main(String[] args) {
//		IceWater w=new IceWater();
//		 w.showTem(3);               3我的温度是: 0度
		Water w =new IceWater();
		w.showTem();
	}
//	public static void print(Water w){
//		w.showTem();
//		
//	}

}
