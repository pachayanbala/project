package org.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class dear {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\user\\eclipse-workspace\\exception\\demo\\article.txt");
		
		
		
		boolean b = f.createNewFile();
		System.out.println(b);
		
		boolean d = f.isDirectory();
		System.out.println(d);
		
		boolean s = f.isFile();
		System.out.println(s);
		
		FileWriter f1 = new FileWriter(f);
		f1.write("my name pachayan");
		f1.close();
		
		FileReader f2 = new FileReader(f);
		char[] a = new char [100];
		f2.read(a);
		for (char c : a) {
			System.out.print(c);
			
		}
		
	}

}
