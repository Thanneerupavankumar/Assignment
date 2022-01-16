package Javaproject;

import java.util.Scanner;

public class ArrayofStrings {

	public static void main(String[] args) {
		
		String str="Assignment";
		String str1=str.toLowerCase();
		Scanner sc=new Scanner(System.in);
		System.out.println("Search a String");
		String question=sc.next();
		int index=str1.indexOf(question);
		if(index==-1) {
			System.out.println(question+"not found");
		}
		else
		{
			System.out.println(question+"is found at index of"+index);
		}

	}

}
