package data;

public class Library {

	public final static int MAX_LIBRARY_PUBLICATION = 100;
	private Publication[] publication = new Publication[MAX_LIBRARY_PUBLICATION];;
	private static int publicationNumber;

	public void addNewPublication(Publication newPublication) {

		if (publicationNumber < MAX_LIBRARY_PUBLICATION) {
			publication[publicationNumber] = newPublication;
			publicationNumber++;
		} else {
			System.out.println("No more space for new publication in our Library");
		}

	}

	public void printPublication() {

		if (publication[0] != null ) {
			for (int i = 0; i < publicationNumber; i++) {
				String print = publication[i].toString();
				System.out.println(print);
			}
		} else {
			System.out.println("No publication at the moment!!!");
		}
	}

}
