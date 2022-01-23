package Assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Readwriteappend {
public static void main(String[] args) {
	File f=new File("pavan.txt");
	File c=new File("kumar.txt");
	try {
		f.createNewFile();
		c.createNewFile();
		System.out.println("successfully created");
	} catch (IOException e) {
		System.out.println("sorry not created");
	}
	try{
	FileWriter fw=new FileWriter("pavan.txt");
	fw.write("important contant is present in this file");
	fw.flush();
	fw.close();
	FileWriter fw1=new FileWriter("kumar.txt");

	fw1.write("this file is not much important");
	System.out.println("successfully completed");
	
	fw1.flush();
	fw1.close();
	}catch(IOException e) {
		System.out.println("sorry not written");
	}
	try {
		FileReader fr=new FileReader("pavan.txt");
		char ch[]=new char[100];
		fr.read(ch);
        	System.out.println(ch);
      
        fr.close();
		FileReader fr1=new FileReader("kumar.txt");
		char v[]=new char[300];
		fr1.read(v);
        
        	System.out.println(v);
		fr1.close();
	} catch (IOException e) {
	     System.out.println("sorry not completed");
	}
    try {
    	FileWriter fw2=new FileWriter(f);
    	fw2.write("this file contants more information ");
    	System.out.println("successfully appended");
    	fw2.close();
    }catch(IOException e) {
    	System.out.println("sorry statements not combined");
    }
}
}
