package j09_추상;


/**
 * 
 * 추상 클래스(abstract class)
 * -> 추상 메소드를 가지면 일반 클래스로 선언할 수 없다.
 * -> 추상 클래스는 생성 할 수 없다.
 * 
 * 추상 메소드(abstract method)
 * -> 자료형 앞에 abstract 키워드가 들어간다.
 * -> 구현부가 없다.
 *
 */

public abstract class Animal {
	public abstract void move();
	public abstract String eat(String food);
	
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
}
