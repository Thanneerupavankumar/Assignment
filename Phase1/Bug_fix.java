package Phase1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bug_fix {
public static void main(String[] args) {
        
        System.out.println("\tWelcome to The product App \n");
        productSelection();

    }
    private static void productSelection() {
        String[] arr = {"1. review a product cost","2. add a product cost","3. return a product cost",
        		"4. sort according to price","5. search a product cost","6. Close selection"};
        int[] arr1 = {1,2,3,4,5,6};
        int  slength = arr1.length;
        for(int i=0; i<slength;i++){
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        ArrayList<Integer> product = new ArrayList<Integer>();
        product.add(10);
        product.add(20);
        product.add(60);
        product.add(40);
        product.add(50);
        product.addAll(arrlist);
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1;j<=slength;j++){
            if(options==j){
                switch (options){
                    case 1:
                        System.out.println("review a product cost: \n");
                        System.out.println(product+"\n");
                        productSelection();
                        break;
                    case 2:
                        System.out.println("add a product cost\n");
                        int value = sc.nextInt();
                        product.add(value);
                        System.out.println("Your product cost is updated\n");
                        product.addAll(arrlist);
                        System.out.println(product+"\n");
                        productSelection();

                        break;
                    case 3:
                        System.out.println("You want to return the product cost confirm again by selecting same option \n");
                        int con_choice = sc.nextInt();
                        if(con_choice==options){
                               product.clear();
                            System.out.println(product+"\n");
                            System.out.println("All your product cost are exchanged!\n");
                        } else {
                            System.out.println("sorry we cannot exchange!");
                        }
                        productSelection();
                        break;
                    case 4:
                        sortProducts(product);
                        productSelection();
                        break;
                    case 5:
                        searchProducts(product);
                        productSelection();
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }

    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    private static void searchProducts(ArrayList<Integer> arrayList) {
        int leng = arrayList.size();
        System.out.println("Enter the product cost you need to search:\t");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i=0;i<leng;i++) {
        	if(arrayList.get(i)==input) {
        		System.out.println("Found the product " + input + " at " + i + " position");
        	}
        }
    }
    private static void sortProducts(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
       //Complete the method.
        
        Collections.sort(arrayList);
        System.out.println("Sorted product: ");
        for(Integer i: arrayList) {
        	System.out.print(i + " ");
        }
        
        System.out.println("\n");
    }
	

}
