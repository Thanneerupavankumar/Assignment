package Assignment2;

public class ThrowFinallyCustom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try{
			System.out.println(5/0);
			//throw new ArithmeticException();
			}
			catch(ArithmeticException e){
				//e.printStackTrace();
				System.out.println("Division by zero is not possible");
			}
			
			System.out.println("Hello All!!!");
	try{
		System.out.println(5/2);
	}
	catch(ArithmeticException e){
		e.printStackTrace();
	}
	finally{
		System.out.println("End of program");
	}
	System.out.println("Hello All!!!");
}
}