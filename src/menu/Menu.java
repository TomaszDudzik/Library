package menu;

public enum Menu {

	ADD_BOOK(1, " - Add Book"),
	ADD_MAGAZINE(2, " - Add Magazine"),
	SHOW_PUBLICATIONS(3, " - Show all Publications"),
	UPLOAD_FILE(4, " - Upload File"),
	EXIT(5," - Close the program");
	
	private int menuNumber;
	private String desc;
	
	private Menu(int menuNumber, String desc) {
		this.menuNumber = menuNumber;
		this.desc = desc;
	}
	
	public static Menu getMenuNumber(int menuNumber){
		return Menu.values()[menuNumber-1];
	}

	public int getMenuNumber() {
		return menuNumber;
	}

	public void setMenuNumber(int menuNumber) {
		this.menuNumber = menuNumber;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString(){
		return menuNumber + desc;
	}
	
}
