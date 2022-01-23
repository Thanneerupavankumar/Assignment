package Assignment2;

import java.util.Scanner;

public class TryCatchBlock {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter values");
	method(s.nextInt(),s.nextInt());
}
static void method(int a,int b){
	try {
	int s=a/b;
	System.out.println(s);
	}catch(ArithmeticException e) {
		b=2;
		System.out.println(a/b);
	}
}
}
