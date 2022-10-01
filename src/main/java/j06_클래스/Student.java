package j06_클래스;

public class Student {
	
	/*
	 * 변수
	 * 메소드
	 */
	
	//변수
	String name;
	int studentYear;
	
	//생성자
	Student() {
		System.out.println("생성자 호출");
	}
	
	Student(String name) {
		this.name = name;
	}
	
	Student(String name, int studentYear) {
		this.name = name;
		this.studentYear = studentYear;
	}
	
	//메소드
	void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("학년: " + studentYear);
	}

}





