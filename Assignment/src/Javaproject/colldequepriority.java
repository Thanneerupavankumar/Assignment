package Javaproject;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class colldequepriority{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Deque<String> name=new ArrayDeque<>();
			name.add("Pavan");
			System.out.println(name);
			
			try{
			System.out.println(name.poll());//poll returns null if value is not available 
			}
			catch(Exception e)
			{
				e.printStackTrace();
				}
			System.out.println(name.isEmpty());
		
		PriorityQueue<String> name1=new PriorityQueue<>();
		name1.add("Pavan");
		//name.add(null); //throw exception
		System.out.println(name);
		
		
	}

}