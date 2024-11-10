package org.jsp.FileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;

class Demo implements Serializable{
	transient int a = 20;
	int b = 20;
}


public class SerializationDeserialization{

	public static void main(String[] args) {
		Demo d1 = new Demo();
		
		
		try {
			FileOutputStream fo = new FileOutputStream("name.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
//			oo.writeObject(d1);
			
			
			FileInputStream fi = new FileInputStream("name.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			System.out.println(d1.a);
			System.out.println(d1.b);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
