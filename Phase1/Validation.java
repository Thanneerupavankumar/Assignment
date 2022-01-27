package Phase1;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] email= {"pavan@email.com","Kumar@email.com"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Search here");
		String mail=sc.next();
		for(String Email:email)
		{
			if(Email.equals(mail))
			{
				System.out.println(mail+"  is found  ");
				break;
			}
			else {
				System.out.println(mail+"  not found  ");
			}
		}

	}

}
