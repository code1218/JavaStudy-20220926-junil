package j10_인터페이스.computer;

public class Laptop extends Computer {

	@Override
	public void powerOn() {
		System.out.println("노트북의 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("노트북의 전원을 끕니다.");
	}
	
}



