package Assignment2;

public class NonSync {
public static void main(String[] args) {
	Result m=new Result();
	Thread r1=new Thread(m);
	Thread r2=new Thread(m);
	Thread r3=new Thread(m);
	r1.setName("Pavan");
	r2.setName("Kumar");
	r3.setName("starts");
	r1.start();
	r2.start();
	r3.start();
}
}
class Result implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("enter i value "+i+"-->"+Thread.currentThread().getName());
		}
		System.out.println("------------Non synchronized--------------");
	}
}