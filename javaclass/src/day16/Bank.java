package day16;

import java.util.Scanner;

public class Bank {
	public static void openAccount(Account account) {
		account.openAccount();
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("What kind of account do you want to open");
		String choice = input.next();

		Account account = null;

		switch (choice) {
		case "current":
			account = new CurrentAccount();

			break;
		case "saving":
			account = new SavingAccount();

			break;
		default:
			System.out.println("wrong selection...");
		}
		if (account != null) {
			Bank.openAccount(account);

		}
		input.close();
	}
}
