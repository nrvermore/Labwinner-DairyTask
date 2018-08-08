//02.类的成员变量 请定义一个交通工具(Vehicle)的类其中有: 
//	属性速度(speed)体积(size)等等 方法移动(move())设置速度(setSpeed(int speed))加速speedUp(),
//	减速speedDown()等等. 最后在测试类Vehicle中的main()中实例化一个交通工具对象并通过方法给它
//	初始化speed,size的值并且通过打印出来。另外调用加速减速的方法对速度进行改变。

package com.day8;
class Vehicle{
	private String name;
	private int speed;
	private float size;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		if(this.speed>90){
			System.out.print("超出安全车速，请惜命...");
			speedDown();
			//System.out.print(speed);
		}else if(this.speed<40){
			System.out.print("hurry，hurry,time is money ");
			speedUp();
			}
		 else{
			System.out.print("正常车速。。。。。 ");}
		
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}
	

	public  void speedUp(){
		 speed=speed+10;	 
	System.out.println("强制提速后的速度"+speed);
	System.out.println("强制提速后的速度还是太慢");
	if(speed<40){
		speed=speed+20;
		System.out.println("提速后的速度"+speed);
	 }
	}
	
	public  void speedDown(){
		for(int i=speed;i>90;i-=10){
		 speed=speed-10;	 
	System.out.println("强制降速后的速度"+speed);	
	}
}

}
public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle();
		v.setName("宝马");
		v.setSize(34);
		v.setSpeed(110);
		System.out.println(v.getName()+"Size"+v.getSize()+"车速"+v.getSpeed());
	}

}
