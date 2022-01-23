package Assignment2;

public class Sync extends Thread{
public static void main(String[] args) {
MyRun r=new MyRun();
Thread t1=new Thread(r);
Thread t2=new Thread(r);
t1.setName("Pavan");
t2.setName("Kumar");
t1.start();
t2.start();
}
}
class MyRun implements Runnable{
	@Override
	public void run() {
		synchronized (this) {
		for(int i=1;i<=2;i++) {
			System.out.println("enter i value "+i+"-->"+Thread.currentThread().getName());
		}
		System.out.println("--------------synchronized-----------------");
		}

	}
}
