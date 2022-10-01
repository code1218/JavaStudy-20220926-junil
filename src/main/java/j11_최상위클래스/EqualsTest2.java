package j11_최상위클래스;

public class EqualsTest2 {

	public static void main(String[] args) {
		Student student1 = new Student(20220001, "김준일");
		Student student2 = new Student(20220001, "김준일");
		
		System.out.println(student1.equals(student2));
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student1.hashCode() == student2.hashCode());
	}

}














