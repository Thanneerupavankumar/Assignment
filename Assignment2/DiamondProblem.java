package Assignment2;

interface Work{
	void work();
}
interface New{
	void result();
}
interface Demo{
	void demo();
}
class Record implements Work,New,Demo{
 @Override
public void work() {
	// TODO Auto-generated method stub
	System.out.println("give energy");
}
 public void result() {
	System.out.println("lets prove this");
}
 @Override
 public void demo() {
		System.out.println("work hard");
}
}
class Review implements Work,New,Demo{
 @Override
 public void work() {
    System.out.println("work out");
    }
    public void result() {
		System.out.println("never leave it");
	}
     @Override
    public void demo() {
    	System.out.println("never judge him");
    }
}
public class DiamondProblem {
public static void main(String[] args) {
Record r=new Record();
r.work();
r.result();
r.demo();
Review r1=new Review();
r1.work();
r1.result();
r1.demo();
}
}