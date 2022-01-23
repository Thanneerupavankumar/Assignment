package Assignment2;

public class Matrices {
public static void main(String[] args) {
	int a[][]= {
			{9,5,3},
			{6,8,8},
			{1,4,2}
			};
	int b[][]= {
			{6,1,3},
			{7,8,5},
			{1,2,6}
			};
	int rows=a.length;
	int col=a[0].length;
	
	int add[][]=new int[rows][col];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<col;j++) {
			add[i][j]=a[i][j]+b[i][j];
		}
	}
	for(int i=0;i<rows;i++) {
		for(int j=0;j<col;j++) {
			System.out.print(add[i][j]+" ");
		}
		System.out.println();
		}
}
}
