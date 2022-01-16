package Javaproject;
import Javaproject.innerclass;

abstract class innerclass {
	   public abstract void display();
	}

public class Innerclass3 {

	public static void main(String[] args) {
	innerclass i = new innerclass() {

	         public void display() {
	            System.out.println("Mphasis Training");
	         }
	      };
	      i.display();
	   }
	}
