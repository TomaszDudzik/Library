package data;

import java.io.Serializable;

public class Book extends Publication implements Serializable{

	private static final long serialVersionUID = 1L;
	private String isbn;
	private String publisher;
	private int pages;

	// Constructor without parameters
	public Book(){
		
	}
	
	// Constructor with parameters
	public Book(String title, String authorFirstName, String authorLastName, int publishedYear, String isbn,
			String publisher, int pages) {
		super(title, authorFirstName, authorLastName, publishedYear);
		this.isbn = isbn;
		this.publisher = publisher;
		this.pages = pages;
	}

	// override toString method
	@Override
	public String toString() {
		return "Book [Title = " + getTitle() + ", Author First Name = " + getAuthorFirstName()
				+ ", Author Last Name = " + getAuthorLastName() + ", Year = " + getPublishedYear()
				+ ", ISBN = " + isbn + ", Publisher = " + publisher + ", Pages = " + pages + "]";
	}

	// getters and setters
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

}
