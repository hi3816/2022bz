package exex;

public class Book {
	private String bookName;
	private String author;
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void setBookName(String _bookName) {
		this.bookName = _bookName;
	}
	public void setAuthor(String _author) {
		this.author = _author;
	}
	
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
}