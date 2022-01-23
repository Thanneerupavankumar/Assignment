package Assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fileoperations {
public static void main(String[] args) {
	File file=new File("demo.txt");
	File wr=new File("required.txt");
	try {
		file.createNewFile();
		wr.createNewFile();
		System.out.println("file created");
	} catch (IOException e) {
		System.out.println("sorry file is not created");
	}
	try {
		FileWriter file1=new FileWriter(file);
		file1.write("expore the file in detail");
		file1.flush();
		System.out.println("written successfully");
		file1.close();
	} catch (IOException e) {
		System.out.println("sorry invalid");
	}
	try {
		FileReader file3=new FileReader(file);
		char ch[]=new char[100];
		file3.read(ch);
		System.out.println(ch);
		System.out.println("don't worry completed");
	} catch (IOException e) {
		System.out.println("nor completed");
	}
	file.renameTo(new File("renamed.txt"));
	System.out.println("renamed successfully");
	System.out.println("required deleted : "+wr.delete());
	System.out.println("deleted successfully");
}
}
