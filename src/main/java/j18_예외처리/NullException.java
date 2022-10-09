package j18_예외처리;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Student {
    private String studentName;
    private String studentYear;
}

public class NullException {

    public static void main(String[] args) {

        Student student = null;

        try {
            System.out.println(student.getStudentName());
        }catch (NullPointerException e) {
            System.out.println("주소 데이터가 비었습니다.");
            System.out.println(Student.class.getSimpleName() + "객체를 생성해주세요.");
        }

    }
}










