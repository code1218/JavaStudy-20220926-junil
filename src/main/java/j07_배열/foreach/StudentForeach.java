package j07_배열.foreach;

import java.util.ArrayList;
import java.util.List;

import j07_배열.classArray.Student;

public class StudentForeach {

	public static void main(String[] args) {
		Student[] students = new Student[5];
		
//		for(Student s : students) {
//			s = new Student();
//		}
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student(i, "김준" + (i + 1));
		}
		
		for(Student s : students) {
			System.out.println(s.toString());
		}
		
		List<Integer> integers = new ArrayList<Integer>(); 
		for(int i = 0; i < 100; i++) {
			integers.add(i + 1);
		}
		
		integers.forEach((num) -> {
			System.out.println(num);
		});
		
		for(int num : integers) {
			System.out.println(num);
		}

	}

}








