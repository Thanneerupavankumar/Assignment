package Javaproject;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number:");
		num1=sc.nextInt();
		System.out.println("Enter second number:");
		num2=sc.nextInt();
		System.out.println("Arithmetic calculator");
		System.out.println("addition of the numbers:"+(num1+num2));
		System.out.println("substraction of the numbers:"+(num1-num2));
		System.out.println("multiplication of the numbers:"+(num1*num2));
		System.out.println("division of the numbers:"+(num1/num2));
		System.out.println("modulus of the numbers:"+(num1%num2));
		

	}

}
