package Assignment2;

public class SleepWait  {
public static void main(String[] args) {
	MyThread t1=new MyThread();
	t1.start();
	try {
		t1.sleep(1000);
	} catch (InterruptedException e) {
		System.out.println("continue");
	}
}
}

class MyThread extends Thread{ 
public void run() {
	Test ot=new Test();
	ot.test();
	synchronized (this) {
		try {
			wait(2000);
			Run y=new Run();
			y.start();
			System.out.println("good");
			wait(3000,4000);
			Goal g=new Goal();
			g.start();
		} catch (InterruptedException e) {
			System.out.println("ok");
		}
		notify();
		System.out.println("lets go");
		notifyAll();
		System.out.println("fun");
	}
}
}
class Run extends Thread{
    public void run() {
    	Test r=new Test();
    	r.test1();
    }
}
class Goal extends Thread{
	public void run() {
		Test f=new Test();
		f.test2();
	}
}
class Test{
	public void test() {
		System.out.println("Hi pavan");
	}
	public void test1() {
	System.out.println("how are you");
}
	public void test2() {
		System.out.println("enjoy");
	}
}
