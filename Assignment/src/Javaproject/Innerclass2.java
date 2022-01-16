package Javaproject;
import Javaproject.Innerclass2;

public class Innerclass2 {

private String message="Employee";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(message);
		 }  
  }  
  
  Inner obj=new Inner();  
  obj.msg();  
 }  

 
public static void main(String[] args) {
	Innerclass2  obj1=new Innerclass2 ();  
	obj1.display();  
	}
}
