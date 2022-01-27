package Phase1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class File_handling {
	public static void main(String[] args) {
		File myObj=new File("filename.txt");
		if(myObj.exists()){
		System.out.println("File name:"+myObj.getName());
		System.out.println("D:\\halo\\config.txt");
		System.out.println("Writable:"+myObj.canWrite());
		System.out.println("Readable:"+myObj.canRead());
		System.out.println("File size in bytes:"+myObj.length());
		}else{
		System.out.println("file doesnot exists");
	}
	try {
		String data="i am in training";
		File f1=new File("D:\\halo\\config.txt");
		if(!f1.exists()) {
			f1.createNewFile();
		}
		FileWriter fileWriter=new FileWriter(f1.getName(),true);
		BufferedWriter bw=new BufferedWriter(fileWriter);
		bw.write(data);
		bw.close();
		System.out.println("done");
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}
}
