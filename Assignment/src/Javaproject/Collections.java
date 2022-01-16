package Javaproject;
import java.util.ArrayList;
import java.util.Deque;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//older way of collections without generics
		ArrayList list=new ArrayList();
		list.add("Pavan");
		list.add(50);
		int ans=(int)list.get(1)+10;
		System.out.println(list.get(0));
		System.out.println(ans);
		//generic class
		ArrayList<String>alist =new ArrayList<>();
		alist.add("Kumar");
		//alist.add(50);
		
		ArrayList<Integer> alist1=new ArrayList<>();
		alist1.add(50);
		int sol=alist1.get(0)+10;

	}

}