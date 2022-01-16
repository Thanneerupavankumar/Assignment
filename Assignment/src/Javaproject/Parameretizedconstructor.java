package Javaproject;
public class Parameretizedconstructor {
	
	 static int num;
	 static String name;
	

	public Parameretizedconstructor(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Parameretizedconstructor obj1=new Parameretizedconstructor(10,"Pavan");
         System.out.println("num:"+obj1.num);
         System.out.println("name:"+obj1.name);
	}

}
