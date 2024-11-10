package org.jsp.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {

	public static void main(String[] args) {
		File f1 = new File("name.txt");
		
		try {
			FileWriter fw = new FileWriter(f1);
			fw.write("hello");
			fw.append("java");
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
