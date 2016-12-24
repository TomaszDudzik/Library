package app;

import data.Library;
import menu.Menu;
import utils.DataReader;

public class LibraryControl {
	
	private Library library;
	private DataReader dataReader;

	public LibraryControl() {

		library = new Library();
		dataReader = new DataReader();

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
			case EXIT:
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
		
		for(Menu items : Menu.values()){
			System.out.println(items);
		}
		
		System.out.print("What is your action: ");
		
	}

}
