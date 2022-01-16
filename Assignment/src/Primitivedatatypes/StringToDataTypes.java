package Primitivedatatypes;

public class StringToDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="10";
		String str2="100";//string as integer
		
		String str3="50";
		String str4="500.0";//string as double
         
		String str5="true";
		String str6="False";//create variables
		
		boolean b1=Boolean.parseBoolean(str5);
		boolean b2=Boolean.parseBoolean(str6);//string to boolean
		
		double num3=Double.parseDouble(str3);
		double num4=Double.parseDouble(str4);//string to double
		
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);//string to int
		
		System.out.println(num1);
		System.out.println(num2);//print int values
		System.out.println(num3);
		System.out.println(num4);//print double values
		System.out.println(b1);
		System.out.println(b2);//print boolean values
		
	}

}
