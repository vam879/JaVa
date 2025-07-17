package Test4.sub1;
/*
 * 날짜 : 25/07/17
 * 이름 : 고정현
 * 내용 : 자바 클래스 문제
 */

public class Main {
	public static void main(String[] args) {
		
		StudentScore student = new StudentScore("홍길동", "S001", "자바", 90.0);
		
		student.printStudentInfo();
		System.out.println("--------------------");
		
		student.updatescore(98.0);
		System.out.println("--------------------");
		
		student.updatescore(102.0);
		System.out.println("--------------------");
		
		student.printStudentInfo();
		System.out.println("--------------------");
	}

}
