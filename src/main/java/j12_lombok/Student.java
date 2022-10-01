package j12_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor	//기본 생성자
@AllArgsConstructor	//전체 생성자
//@Getter	
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
public class Student {
	private int code;
	private String name;
}












