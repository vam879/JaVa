package test.sub4;

public class Book {
	
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowed;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowed = false;
	}
	
	public void borrowBook() {
		this.isBorrowed = true;
		
		if(this.isBorrowed) {
			System.out.println(this.title + "이미 대출됨");
		}else {+
		
	}

}
