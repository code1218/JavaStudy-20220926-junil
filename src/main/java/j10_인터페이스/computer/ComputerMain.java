package j10_인터페이스.computer;

public class ComputerMain {

	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		
		desktop.powerOn();
		desktop.connect("빔프로젝트");
		desktop.disConnect("빔프로젝트");
		desktop.powerOff();

	}

}
