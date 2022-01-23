package Assignment2;

interface Pavan{
	void prepare();

	void enjoy();
}
class Kumar implements Pavan{
	public void enjoy() {
		System.out.println("enjoyed");
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
}
class Helper {
     Pavan help() {
		Pavan c=new Kumar();
		return c;
	}
}
public class Abstraction {
public static void main(String[] args) {
	Helper h=new Helper();
	Pavan boy=h.help();
	boy.enjoy();
}
}