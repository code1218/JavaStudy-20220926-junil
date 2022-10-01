package j05_메소드;

/**
 * 
 * 		===================<< 메소드 오버로딩 >>==================
 * 
 */
public class Method03 {

//	public static int test() {
//		return 100;
//	}
	
	public static void test() {
		System.out.println("매개변수가 없음");
	}
	
	public static void test(int num) {
		System.out.println("두번째 test 메소드");
	}
	
	public static void test(double aa) {
		System.out.println("세번째 test 메소드");
	}
	
	public static void test(int num, int num2) {
		System.out.println("네번째 test 메소드");
	}
	
	public static void test(int num, String str) {
		System.out.println("다섯번째 test 메소드");
	}
	
	
	public static void main(String[] args) {
		test();
		test(10);
		test(3.14);
		test(10, 20);
		test(100, "100");
	}

}





