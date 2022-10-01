package j05_메소드;

import java.time.LocalDateTime;

/**
 * 
 * @author ITPS
 *
 */
public class Method02 {
	
	/*
	 * 매개변수 x	->	()
	 * 반환 x	->	void
	 */
	public static void test1() {
		System.out.println("test1메소드: 매개변수x, 반환x");
	}
	
	/*
	 * 매개변수 1개	->	(int 변수명)
	 * 반환 x		->	void
	 */
	public static void test2(int num) {
		System.out.println("test2메소드: 매개변수 int num(" + num + "), 반환x");
	}
	
	/*
	 * 매개변수 2개	->	(int 변수명, String 변수명)
	 * 반환 x		->	void
	 */
	public static void test3(int num, String str) {
		System.out.println("test3메소드: ");
		System.out.println("\t매개변수 int num(" + num + ")");
		System.out.println("\t매개변수 String str(" + str + ")");
	}
	
	/*
	 * 매개변수 x	->	()
	 * 반환 o	->	int
	 */
	public static int test4() {
		System.out.println("test4메소드: 매개변수x, 정수 반환");
		return (100 + 200) / 10;
	}
	
	/*
	 * 매개변수 x	->	()
	 * 반환 o	->	String
	 */
	public static String test5() {
		System.out.println("test5메소드: 매개변수x, 문자열 반환");
		int year = LocalDateTime.now().getYear();
		//year = 2000;
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return "윤년";
		}else {
			return "윤년x";
		}
	}
	
	/*
	 * 매개변수 2개	->	(int num1, int num2)
	 * 반환 o		->	String
	 */
	public static String evenAndOdd(int num1, int num2) {
		
		if((num1 + num2) % 2 == 0) {
			return "짝수";
		}else {
			return "홀수";
		}
	}
	
	/*
	 * 반환 x 없는 메소드에서 강제로 메소드를 탈출하는 방법
	 * 
	 */
	public static void test6(boolean flag) {
		System.out.println("1번 로직");
		System.out.println("2번 로직");
		if(flag) {
			System.out.println("메소드 강제로 탈출");
			return;
		}
		System.out.println("3번 로직");
		System.out.println("4번 로직");
	}
	
	public static void main(String[] args) {
		test1(); //메소드(함수) call(호출)
		
		test2(10);
		test2(100);
		
		test3(200, "김준일");
		test3(10, "JAVA");
		
		System.out.println(test4());
		int r1 = test4();
		System.out.println(r1);
		
		System.out.println(test5());
		
		System.out.println(evenAndOdd(7, 8));
		
		test6(true);
		
		System.out.println("test6메소드 다음에 실행");
	}

}










