package j06_클래스;

public class StudentMain {

	public static void main(String[] args) {
		/*
		 * 두 종류의 자료형
		 * 1. 일반자료형(int, double, char, boolean)
		 * 2. 참조자료형(클래스, String, Scanner, Student)
		 */
		
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student("김준일");
		Student student4 = new Student();
		Student student5 = new Student();
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		System.out.println(student5);
		
		student1.name = "김준일";
		student1.studentYear = 2;
		student1.showInfo();
		
		student2.name = "김준이";
		student2.studentYear = 3;
		student2.showInfo();
		
		

	}

}




