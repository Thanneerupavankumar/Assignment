package Javaproject;

public class Constructors {
	
	static int Id;
	static String Name;
	

	public Constructors(int Id, String Name) {
		super();
		this.Id = Id;
		this.Name = Name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Constructors obj=new Constructors(Id,Name);
         System.out.println("Constructors.Id");
         System.out.println("Constructors.Name");
	}

}

