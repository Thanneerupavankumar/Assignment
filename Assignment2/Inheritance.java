package Assignment2;

class A{
	int i=12;
	static double aa=43;
	void work() {
		System.out.println("Pavan");
	}
	static void Demo() {
		System.out.println("continue");
	}
}
class C extends A{
	int h=30;
}
class B extends C{
	int j=13;
	void release() {
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(aa);
		A a=new A();
	    a.work();
	    Demo();
}
}
public class Inheritance {
public static void main(String[] args) {
	B b=new B();
	b.release();
}
}
