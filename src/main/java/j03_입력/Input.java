package j03_입력;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String 	name 		= null;
		int 	age 		= 0;
		String 	address 	= null;
		String 	phone 		= null;
		
		//부산 동래구 사직동
		
		System.out.print("이름: ");
		name = scanner.next();
		System.out.print("나이: ");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("주소: ");
		address = scanner.nextLine();
		System.out.print("연락처: ");
		phone = scanner.next();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(phone);

	}

}






