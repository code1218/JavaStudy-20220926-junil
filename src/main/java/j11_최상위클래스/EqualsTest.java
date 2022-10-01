package j11_최상위클래스;

import java.util.Scanner;

public class EqualsTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String nameInput = scanner.next();
		
		System.out.println(nameInput);
		
		String str1 = "김준일";
		String str2 = "김준일";
		String str3 = new String("김준일");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(nameInput));
		System.out.println(str2.equals(nameInput));
		System.out.println(str1.equals(str3));
		
	}

}














