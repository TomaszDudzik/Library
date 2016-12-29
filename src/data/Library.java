package data;

import java.io.Serializable;
import java.util.ArrayList;

public class Library implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//public final static int MAX_LIBRARY_PUBLICATION = 1;
	//private Publication[] publication;
	//private static int publicationNumber;
	
	private ArrayList<Publication> publication;
	
	public Library(){
	
	publication = new ArrayList<Publication>();
		
	}
	
	//public Library(Publication[] publication){
	//	this.publication = publication;
	//}
	
	//public Library(ArrayList<Publication> publication){
	//	this.publication = publication;
	//}
	
//	public void addNewPublication(Publication newPublication) {
//
//		publication = new Publication[MAX_LIBRARY_PUBLICATION];
//		
//		if (publicationNumber < MAX_LIBRARY_PUBLICATION) {
//			publication[publicationNumber] = newPublication;
//			publicationNumber++;
//		} else {
//			System.out.println("No more space for new publication in our Library");
//		}
//
//	}
	
	public void addNewPublication(Publication newPublication) {
		
		publication.add(newPublication);
		
	}

//	public void printPublication() {
//
//		if (publication[0] != null ) {
//			for (int i = 0; i < publication.length; i++) {
//				String print = publication[i].toString();
//				System.out.println(print);
//			}
//		} else {
//			System.out.println("No publication at the moment!!!");
//		}
//	}
	
	public void printPublication() {

		for(Publication items : publication){
			
			System.out.println(items.toString());
		}
	}

	public ArrayList<Publication> getPublication() {
		return publication;
	}

	public void setPublication(ArrayList<Publication> publication) {
		this.publication = publication;
	}
	
	

}
