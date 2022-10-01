package j12_lombok;

public class StudentTestMain {

	public static void main(String[] args) {
		Student student = new Student(20220001, "김준일");
		Student student2 = new Student(20220002, "김준이");
		Student student3 = new Student(20220002, "김준이");
		
		System.out.println(student);
		System.out.println(student2);
		System.out.println(student2.equals(student3));
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());

	}

}
