package j15_컬렉션.리스트;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Student {
    private static int autoNumber = 20220001;

    private int studentCode;
    private String name;

    public Student(String name) {
        studentCode = autoNumber++;
        this.name = name;
    }

}
