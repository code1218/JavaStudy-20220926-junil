package j03_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("a + b: " + (a + b));
	}

}
