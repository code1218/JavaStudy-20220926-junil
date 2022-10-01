package j04_반복;

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		
		System.out.print("입력: ");
		n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.println(n - i);
		}
		
		/*
		 * 입력: 10
		 * 
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 6
		 * 7
		 * 8
		 * 9
		 * 10
		 * 
		 */

	}

}
