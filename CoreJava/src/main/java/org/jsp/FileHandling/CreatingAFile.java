package org.jsp.FileHandling;

import java.io.File;

public class CreatingAFile {

//	public static void main(String[] args) {
//		File file = new File("name.txt");
//		try {
//			file.createNewFile();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//
//		System.out.println("Done");
//	}
	
	public static void main(String[] args) {
		File f1 = new File("src/main/java/org/jsp/FileHandling/Files/mango.txt");
		try {
			f1.createNewFile();
		}
		catch(Exception e) {
			e.printStackTrace();		
		}
	}
}
