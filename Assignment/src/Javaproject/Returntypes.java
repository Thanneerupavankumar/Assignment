package Javaproject;

public class Returntypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Returntypes R=new Returntypes();
		System.out.println("R.Int(1,5)");
		System.out.println("R.Double(10.0,15.0)");
		System.out.println("R.Char('p')");
		System.out.println("R.Boolean(20)");
		System.out.println("R.Float(25.5f,30.5f)");
		

	}
	int Int(int a,int b) {
		return a+b;
		
	}
	double Double(double b,double g) {
		return b+g;
	}
	char Char(char c) {
		return c;
	}
	boolean Boolean(int p) {
		if(p>0) {
			return true;
		}
		else {
			return false;
		}
	}
	float Float(int f) {
		return f;
	}

}
