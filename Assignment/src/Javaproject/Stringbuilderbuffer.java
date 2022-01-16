package Javaproject;

public class Stringbuilderbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Pavan";
		
		StringBuffer Str1=new StringBuffer(str);
		
		StringBuilder Str2=new StringBuilder(str);
		
		Str1.append("Assignment");
		Str2.append("Assignment");
		
		System.out.println(Str1);
		System.out.println(Str2);

	}

}
