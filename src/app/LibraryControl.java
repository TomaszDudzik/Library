package app;

import data.Library;
import menu.Menu;
import utils.DataReader;
import utils.FileManager;

public class LibraryControl {

	private Library library;
	private DataReader dataReader;
	private FileManager fileManager;

	public LibraryControl() throws Exception {

		//library = new Library();
		dataReader = new DataReader();
		fileManager = new FileManager();
		
		try {
			library = fileManager.upload();
			System.out.println("load");
		} catch (Exception e) {
			library = new Library();
			e.printStackTrace();
			System.out.println("new library");
		}
		
	}

	public void controlApp() {
		Menu menuNumber;
		menu();

		while ((menuNumber = Menu.getMenuNumber(dataReader.chooseAction())) != Menu.EXIT) {
			switch (menuNumber) {

			case ADD_BOOK:
				library.addNewPublication(dataReader.createNewBook());
				break;
			case ADD_MAGAZINE:
				library.addNewPublication(dataReader.createNewMagazine());
				break;
			case SHOW_PUBLICATIONS:
				library.printPublication();
				break;
			case UPLOAD_FILE:
				try {
					fileManager.upload();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case EXIT:
				return;
			default:
				System.out.println("No available, please try again.");
			}

			menu();
		}
		try {
			fileManager.save(library);
			System.out.println("Library has been saved");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thank you and goodbay, library closed!");

	}

	public void menu() {

		System.out.println("Available menu");

		for (Menu items : Menu.values()) {
			System.out.println(items);
		}

		System.out.print("What is your action: ");

	}

}
