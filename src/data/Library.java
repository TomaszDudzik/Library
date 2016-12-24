package data;

public class Library {

	public final static int MAX_LIBRARY_PUBLICATION = 100;
	private Publication[] library = new Publication[MAX_LIBRARY_PUBLICATION];;
	private static int publicationNumber;

	public void addNewPublication(Publication publication) {

		if (publicationNumber < MAX_LIBRARY_PUBLICATION) {
			library[publicationNumber] = publication;
			publicationNumber++;
		} else {
			System.out.println("No more space for new publication in our Library");
		}

	}

	public void printPublication() {

		if (library[0] != null ) {
			for (int i = 0; i < publicationNumber; i++) {
				String print = library[i].toString();
				System.out.println(print);
			}
		} else {
			System.out.println("No publication at the moment!!!");
		}
	}

}
