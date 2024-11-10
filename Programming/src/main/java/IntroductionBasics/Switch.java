package IntroductionBasics;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a no between 1 to 5 and press 6 to exit..");
			int i = sc.nextInt();
			switch (i) {
				case 1:
					System.out.println("You have entered 1");
					break;
		
				case 2:
					System.out.println("You have entered 2");
					break;
		
				case 3:
					System.out.println("You have entered 3");
					break;
		
				case 4:
					System.out.println("You have entered 4");
					break;
		
				case 5:
					System.out.println("You have entered 5");
					break;
				case 6:
					System.out.println("Exited...");
					return;
				default:
					System.out.println("Invalid choice...");
			}
		}
	}

}
