package j08_상속.animal;


/**
 * 
 * 상속(Inheritance)
 * 상속관계 키워드 extends
 * 
 * 부모 클래스와 자식 클래스의 관계를 가짐
 * 부모 클래스의 private 접근 지정자를 제외한 모든 맴버변수와, 메소드를 상속할 수 있다.
 *
 */

public class Animal {
	
	public Animal() {
		System.out.println("Animal(부모) 객체 생성");
	}

	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}












