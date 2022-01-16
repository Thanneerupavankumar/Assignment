package Javaproject;
public class Innerclass1 {

	 private String msg="My name is pavan"; 
	 
	 class Inner{  
	  void hello(){
		  System.out.println(msg+", I am employee of Mphasis");
		  }  
	 }  


	public static void main(String[] args) {

		Innerclass1 obj=new Innerclass1();
		Innerclass1.Inner obj1=obj.new Inner();  
		obj1.hello();  
	}
}
