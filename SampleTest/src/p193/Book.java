package p193;
//제목과 저자를 나타내는 title과author 필드를 가진 book클래스를 작성하고 생성자를 작성하여 필드를 초기화
public class Book {
	String title;
	String author;
	
	public Book(String t) { //생성자
		title = t;
		author = "작자미상";
	}
	
	public Book(String t, String a) { //생성자
		title = t;
		author = a;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리"); //생성자 Book(String t, String a) 호출
		Book loveStory = new Book("춘향전"); // 생성자 Book(String t)호출
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}

}
