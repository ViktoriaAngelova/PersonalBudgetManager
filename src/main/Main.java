package main;

import java.util.Scanner;
import java.util.regex.*;

public class Main {

	public static Scanner scanner = new Scanner(System.in);
	public static String choice;
	public static StringBuilder dateBuilder = new StringBuilder();
	public static StringBuilder valueBuilder = new StringBuilder();

	public static void main(String[] args) {

		String username = "Admin";
		String password = "1234";

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
		startMenu();

		scanner.close();
	}

	public static void startMenu() {

		System.out.println("For new revenue press R.");
		System.out.println("For new cost press C.");
		System.out.println("To display a balance press B: ");

		// Validating user input
		do {
			choice = scanner.nextLine().toLowerCase();
			switch (choice) {
			case "r":
				newRevenue();
				break;
			case "c":
				// TODO
				break;
			case "b":
				// TODO
				break;
			default:
				System.out.println("Invalid choice! Please, press R, C or B, depending on your choice: ");
			}
		} while (choice != "r" || choice != "c" || choice != "b");

	}

	public static void newRevenue() {

		System.out.println("-------New Revenue-------");
		System.out.println("[add date (dd.mm.yyyy)] $ [add value (0,00)]");

		String inputRevenue = scanner.nextLine();
		String validRevenue = dataValidation(inputRevenue);
		// TODO processData(validRevenue);

		System.out.println("To add another revenue press A.");
		System.out.println("To go back to start menu press M: ");

		// Validating user input
		do {
			choice = scanner.nextLine().toLowerCase();
			switch (choice) {
			case "a":
				newRevenue();
				break;
			case "m":
				startMenu();
				break;
			default:
				System.out.println("Invalid choice! Please, press A or M, depending on your choice: ");
			}
		} while (choice != "a" || choice != "m");

	}

	public static String dataValidation(String data) {

		// Setting date and value format
		String regex = "^(\\d{2}\\.\\d{2}\\.\\d{4})(\\s\\$\\s)(\\d{1,}\\,\\d{2})$";
		boolean isMatching = Pattern.matches(regex, data);

		// Date and value validation
		while (!isMatching) {
			System.out.println("Invalid date or value format! Enter date and value in the correct format: ");
			data = scanner.nextLine();
			isMatching = Pattern.matches(regex, data);
		}

		return data;
	}

}
