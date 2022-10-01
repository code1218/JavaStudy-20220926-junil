package j13_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private static int autoNumber = 20220001;

    private int studentCode;
    private String studentName;
    private int studentYear;
    private String studentPhone;
    private String studentAddress;

    public Student(String studentName) {
        studentCode = autoNumber++;

        this.studentName = studentName;
    }
}
