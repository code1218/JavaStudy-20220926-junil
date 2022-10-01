package j05_메소드;

public class Method01 {

	public static int add(int x, int y) {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		return x + y;
	}
	
	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		int result = add(a, b);

		System.out.println("결과: " + result);
	}

}
