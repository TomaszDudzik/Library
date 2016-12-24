package app;

import data.Library;
import utils.DataReader;

public class LibraryControl {

	public final static int ADD_BOOK = 1;
	public final static int ADD_MAGAZINE = 2;
	public final static int SHOW_PUBLICATIONS = 3;
	public final static int EXIT = 4;
	
	private Library library;
	private DataReader dataReader;

	public LibraryControl() {

		library = new Library();
		dataReader = new DataReader();

	}

	public void controlApp() {
		int menuNumber;
		menu();
		
		while ((menuNumber = dataReader.chooseAction()) != 4) {
			switch (menuNumber) {

			case (ADD_BOOK):
				library.addNewPublication(dataReader.createNewBook());
				break;
			case (ADD_MAGAZINE):
				library.addNewPublication(dataReader.createNewMagazine());
				break;
			case (SHOW_PUBLICATIONS):
				library.printPublication();
				break;
			case (EXIT):
				return;
			default:
				System.out.println("No available, please try again.");
			}
			
			menu();
		}
		
		System.out.println("Thank you and goodbay, library closed!");
		
	}
	
	public void menu(){
		
		System.out.println("Available menu");
		System.out.println(ADD_BOOK + " - Add Book");
		System.out.println(ADD_MAGAZINE + " - Add Magazine");
		System.out.println(SHOW_PUBLICATIONS + " - Show all Publications");
		System.out.println(EXIT + " - Close the program");
		System.out.print("What is your action: ");
		
	}

}
