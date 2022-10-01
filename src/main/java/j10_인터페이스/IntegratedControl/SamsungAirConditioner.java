package j10_인터페이스.IntegratedControl;

public class SamsungAirConditioner extends AirConditioner {

	public SamsungAirConditioner(String company, int serialNumber, String productName) {
		super(company, serialNumber, productName);
	}

	public void runSmartThings() {
		System.out.println("삼성 SmartThings 기능을 활성화 합니다.");
	} 
	
}
