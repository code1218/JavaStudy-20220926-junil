package j13_스태틱;

public class StudentStaticMain {

    public static void main(String[] args) {
        Student[] students = new Student[10];

        for(int i = 0; i < students.length; i++) {
            students[i] = new Student("김준일" + (i + 1));
            System.out.println(students[i]);
        }

    }

}
