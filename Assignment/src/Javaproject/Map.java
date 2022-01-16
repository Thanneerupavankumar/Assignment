package Javaproject;
import java.util.HashMap;
public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap m=new HashMap();
		m.put(10,"Pavan");
		m.put(20,"Kumar");
		System.out.println(m);
		System.out.println(m.get(10));
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.containsKey(20));
		System.out.println(m.containsValue("Kumar"));
		System.out.println(m);
		m.clear();
		System.out.println(m);
		

	}

}
