package bookArrayListEx;

public class Book {
	private String author;
	private String bookName ;
	
	public Book (String author, String bookName) {
		this.author = author;
		this.bookName = bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return this.author;
	}
	public String getBookName() {
		return this.bookName;
	}
	
	public void showInfo() {
		System.out.println("작가 : "+author);
		System.out.println("책이름 : "+bookName);
	}
}
