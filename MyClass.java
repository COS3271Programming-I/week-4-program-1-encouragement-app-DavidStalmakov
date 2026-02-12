package projectdavid;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("How are you doing today? ");
		String feeling = scanner.nextLine().toLowerCase();
		
		if (age < 13 && feeling.contains("good")) {
			System.out.println("Young and happy is always good");
		}
		else if (age < 13 && feeling.contains("bad")) {
			System.out.println("Tough days will come and go, learn from hard times to rejoice in good times.");
		}
		else if (age >= 13 && feeling.contains("good")) {
			System.out.println("Although life is busy you still find time to be happy, good job!");
		}
		else if (age >= 13 && feeling.contains("bad")) {
			System.out.println("Hang in there. Tomorrow is a new day!");
		}
		else {
			System.out.println("Rejoice Always!");
		}
		scanner.close();
		   
	    }
	}
        



