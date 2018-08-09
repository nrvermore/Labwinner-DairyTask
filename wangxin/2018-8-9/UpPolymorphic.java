package com.day9;

class color{
     public void painting(){
    	 System.out.println("颜料被拿来画画了。。。。");
     }
}
class white extends color{	
	public void painting(){
   	 System.out.print("白色被拿来画画了。。。。");
    }
	
}
class green extends color{
	public void painting(){
	   	 System.out.print("绿色被拿来画画了。。。。");
	    }
}
public class UpPolymorphic {

	public static void main(String[] args) {
//	向上转型  color co=new green()
//	  print(co);
//	  color wh=new white();
//	  print(wh);
	  
	  color co=new white();
//	  green gr=(green)co;
//	  gr.painting();
	  if(co instanceof green){
		  green gr=(green)co;
		  gr.painting();  
	  }else {
		  System.out.print("不是同一种类型哦，不能转换");
	     }
	}
	public static void print(color c){
		c.painting();
		
	  }

}
