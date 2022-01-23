package Assignment2;

public class Threadcreation extends Thread{
public static void main(String[] args) {
	Threadcreation t=new Threadcreation();
	t.start();
	Release r=new Release();
	r.run();
	System.out.println(Thread.currentThread().getName());
}
public void run() {
	System.out.println("Hello Pavan");
	System.out.println(Thread.currentThread().getName());
}
}
class Release implements  Runnable {
	public void run() {
		System.out.println("Hi how are you");
	}
}
