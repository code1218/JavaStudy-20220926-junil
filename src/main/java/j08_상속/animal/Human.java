package j08_상속.animal;


/**
 * 
 * Override(재정의)
 * 상속받은 부모의 메소드를 자식 클래스에서 다시 정의하는 것
 * 
 * @ -> 어노테이션
 *
 */

public class Human extends Animal {

	public Human() {
		super();
		System.out.println("Human(자식) 객체 생성");
	}
	
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}












