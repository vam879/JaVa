package test04.sub5;

public class Subject {
	
	private String subName;
	private Student[] students;
	private int studentCount;
	
	public Student(String subName) {
		this.subName = subName;
		this.students = new Student[1];
		this.studentCount = 0;
	}
	
	public void addStudent(Student std) {
		sutdents[studentCount++] = std;
	}
	
	public void printSubjectInfo() {
		System.out.println("과목명 : " + this.subName);
		
		System.out.print("수강생 : ");
		
		for(int i =0; i<students.length ; i++) {
			System.out.println(student.getName() + ", ");
			
		}
		System.out.println(); //개행
	}
	
	public String getSubName() {
		return subName;
	}
	
	

}
