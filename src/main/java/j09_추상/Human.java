package j09_추상;

public class Human extends Animal {
	
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	@Override
	public String eat(String food) {
		return food + " 음식을 먹습니다.";
	}
	
}
