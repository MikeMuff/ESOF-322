package utils;

import java.io.FileWriter;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		System.out.println("\nWhich Database tool do you want to use?");
		System.out.println("1 - Relational");
		System.out.println("2 - NoSQL");
		System.out.println("3 - Graph\n");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		StratManager man = new StratManager(number);
		man.store();
		

		System.out.println("\nWhich Storage strategy do you want to use?");
		System.out.println("1 - Table Store");
		System.out.println("2 - Document Store");
		System.out.println("3 - Node Store\n");
		input = new Scanner(System.in);
		number = input.nextInt();
		man.setStrategy(number);
		man.store();
	}
}
