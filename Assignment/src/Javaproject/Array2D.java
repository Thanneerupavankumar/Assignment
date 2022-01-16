package Javaproject;
import java.util.Scanner;

public class Array2D{
	int arr[][]=new int[3][2];
	void getInfo(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 6 numbers");
		for(int row=0;row<arr.length;row++){
			
			for(int col=0;col<arr[row].length;col++){
				arr[row][col]=sc.nextInt();
			}
		}
	}
		void display(){
			for(int row=0;row<arr.length;row++){
				
				for(int col=0;col<arr[row].length;col++){
					System.out.print(arr[row][col]+" ");
				}
				System.out.println();
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2D obj=new Array2D();
		obj.getInfo();
		obj.display();
	}

}