package j10_인터페이스.computer;

public class Desktop extends Computer implements HDMI {

	@Override
	public void powerOn() {
		System.out.println("데스크탑의 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("데스크탑의 전원을 끕니다.");
	}

	@Override
	public void connect(String device) {
		System.out.println("장치: " + device);
		System.out.println("연결합니다.");
		System.out.println();
	}

	@Override
	public void disConnect(String device) {
		System.out.println("장치: " + device);
		System.out.println("연결 해제 합니다.");
		System.out.println();
	}
	
}











