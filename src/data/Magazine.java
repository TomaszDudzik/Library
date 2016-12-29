package data;

import java.io.Serializable;

public class Magazine extends Publication implements Serializable {

	private static final long serialVersionUID = 1L;
	private String language;
	private int month;
	private int day;

	// Constructor without parameters
	public Magazine(){
		
	}
	
	// Constructor with parameters
	public Magazine(String title, String authorFirstName, String authorLastName, int publishedYear, String language,
			int month, int day) {
		super(title, authorFirstName, authorLastName, publishedYear);
		this.language = language;
		this.month = month;
		this.day = day;
	}
	
	// override toString method
	@Override
	public String toString() {
		return "Magazine [Title = " + getTitle() + ", Author First Name = " + getAuthorFirstName()
				+ ", Author Last Name = " + ", Language = " + language + ", Year = " + getPublishedYear() + ", Month = "
				+ month + ", Day = " + day + "]";
	}

	// getters and setters
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

}
