package main;

import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String username = "Admin";
		String password = "1234";
		String choice;

		System.out.println("Welcome to Personal Budget Manager!");
		System.out.println("USER: ");
		String usernameInput = scanner.nextLine();

		// Verification on the input data for user name
		while (!usernameInput.equals(username)) {
			System.out.println("Invalid username!");
			System.out.println("USER: ");
			usernameInput = scanner.nextLine();
		}

		System.out.println("PASSWORD: ");
		String passwordInput = scanner.nextLine();

		// Verification on the input data for password
		while (!passwordInput.equals(password)) {
			System.out.println("Invalid password!");
			System.out.println("PASSWORD: ");
			passwordInput = scanner.nextLine();
		}

		System.out.println("Hello, " + usernameInput + "!");
		System.out.println("For new revenue press R.");
		System.out.println("For new cost press C.");
		System.out.println("To display a balance press B: ");

		// Validating user input
		do {
			choice = scanner.nextLine().toLowerCase();
			switch (choice) {
			case "r":
				break;
			case "c":
				break;
			case "b":
				break;
			default:
				System.out.println("Invalid choice! Please, press R, C or B, depending on your choice: ");
			}
		} while (choice != "r" || choice != "c" || choice != "b");

	}

}
