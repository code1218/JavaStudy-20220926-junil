package j07_배열.classArray;

public class StudentArrayMain {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println("----------------------------------");
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student(20220001 + i, "김준" + (i + 1));
		}
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString());
		}
	}

}
