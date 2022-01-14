package prob2;

public class Book {
	private int bookNo;
	private String title;
	private String autor;
	private int stateCode = 1;
	
	public Book(int bookNo, String title, String autor) {
		this.bookNo = bookNo;
		this.title = title;
		this.autor = autor;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

}
