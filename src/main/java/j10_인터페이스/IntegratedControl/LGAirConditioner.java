package j10_인터페이스.IntegratedControl;

public class LGAirConditioner extends AirConditioner {

	public LGAirConditioner(String company, int serialNumber, String productName) {
		super(company, serialNumber, productName);
	}

	public void runThinQ() {
		System.out.println("삼성 ThinQ 기능을 활성화 합니다.");
	} 
	
}
