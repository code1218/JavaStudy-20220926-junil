package j15_컬렉션.리스트;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class StudentService {
    private List<Student> studentList;

    public void addStudent(String name) {
        studentList.add(new Student(name));
    }

    public void printStudentList() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(i + 1 + ". " + studentList.get(i));
        }
    }

    public Student getStudent(int studentCode) {
        for (Student s : studentList) {
            if(s.getStudentCode() == studentCode) {
                return s;
            }
        }
        return null;
    }


    public void modifyStudentName(int studentCode, String name) {
        Student s = getStudent(studentCode);
        if(s == null) {
            System.out.println("해당 코드의 학생이 없습니다.");
            return;
        }
        s.setName(name);
    }

    public void removeStudent(int studentCode) {
        for(int i = 0; i < studentList.size(); i++) {
            Student s = studentList.get(i);
            if(s.getStudentCode() == studentCode) {
                studentList.remove(i);
                return;
            }
        }
        System.out.println("해당 코드의 학생이 없습니다.");
    }

}
