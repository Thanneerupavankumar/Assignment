package Assignment2;

public class Polymorphism {
public static void main(String[] args) {
      Polymorphism c=new Polymorphism();
	add(3,4);
	c.add(5, 6.6);
	add(4,1,1);
}
public static void add(int a,int b) {
	System.out.println(a+b);
}
public void add(int a,double c) {
	System.out.println(a+c);
}
public static void add(int a,int b,int s) {
	System.out.println(a-b-s);
}
}
