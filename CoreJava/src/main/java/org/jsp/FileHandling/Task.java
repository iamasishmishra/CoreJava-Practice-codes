package org.jsp.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task {

	private static void createWriteReadFile() throws IOException {
        
        try (FileWriter writer = new FileWriter("example.txt")) {
            System.out.println("Enter content to write to the file (type 'exit' to stop):");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(input + "\n");
            }
            System.out.println("Content written to the file.");
        }

        
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            System.out.println("Contents of the file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
	}
        
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        try {
	            createWriteReadFile();
	        } catch (IOException e) {
	            System.err.println("An error occurred: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }

	}

}
