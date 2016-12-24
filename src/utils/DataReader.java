package utils;

import java.util.Scanner;

import data.Book;
import data.Magazine;

public class DataReader {

	Scanner sc = new Scanner(System.in);

	public int chooseAction() {

		int menuNumber = sc.nextInt();
		sc.nextLine();
		return menuNumber;

	}

	public Book createNewBook() {

		System.out.println("Create new Book");
		System.out.print("Enter title: ");
		String title = sc.nextLine();
		System.out.print("Enter author first name: ");
		String authorFirstName = sc.nextLine();
		System.out.print("Enter author last name: ");
		String authorLastName = sc.nextLine();
		System.out.print("Enter published year: ");
		int publishedYear = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter ISBN: ");
		String isbn = sc.nextLine();
		System.out.print("Enter publisher: ");
		String publisher = sc.nextLine();
		System.out.print("Enter pages: ");
		int pages = sc.nextInt();
		sc.nextLine();

		return new Book(title, authorFirstName, authorLastName, publishedYear, isbn, publisher, pages);
	}

	public Magazine createNewMagazine() {

		System.out.println("Create new Magazine");
		System.out.print("Enter title: ");
		String title = sc.nextLine();
		System.out.print("Enter author first name: ");
		String authorFirstName = sc.nextLine();
		System.out.print("Enter author last name: ");
		String authorLastName = sc.nextLine();
		System.out.print("Enter language: ");
		String language = sc.nextLine();
		System.out.print("Enter published year: ");
		int publishedYear = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter published month: ");
		int month = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter published day: ");
		int day = sc.nextInt();
		sc.nextLine();

		return new Magazine(title, authorFirstName, authorLastName, publishedYear, language, month, day);

	}

}
