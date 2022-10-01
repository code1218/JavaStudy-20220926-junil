package j10_인터페이스.IntegratedControl;

public class IntegratedControlService {
	
	private AirConditioner[] airConditioners;

	public void init(int airConditionerCount) {
		airConditioners = new AirConditioner[airConditionerCount];
		
		for(int i = 0; i < airConditioners.length; i++) {
			if(i % 2 == 0) {
				airConditioners[i] = new LGAirConditioner("LG", 20220001 + i, "엘지에어컨v" + i);	
			}else {
				airConditioners[i] = new SamsungAirConditioner("SAMSUNG", 20220001 + i, "삼성에어컨v" + i);				
			}
		}
	}
	
	public void printPowerStatus(AirConditioner airConditioner) {
		String productName = airConditioner.getProductName();
		int serialNumber = airConditioner.getSerialNumber();
		
		System.out.println(productName + "(" + serialNumber + "): " + (airConditioner.isPowerStatus() ? "켜짐" : "꺼짐"));
	}
	
	public int getAirConditionersSize() {
		return airConditioners.length;
	}
	
	public void showAirConditionersStatus() {
		System.out.println("에어컨 생성 정보");
		
		for(int i = 0; i < airConditioners.length; i++) {
			System.out.print(i + 1 + ".\t");
			printPowerStatus(airConditioners[i]);
		}
	}
	
	public void selectedOn(int index) {
		AirConditioner airConditioner = airConditioners[index - 1];
		
		airConditioner.powerOn();
		System.out.println(airConditioner.getProductName() + "에어컨 전원을 켭니다.");
	}
	
	public void selectedOff(int index) {
		AirConditioner airConditioner = airConditioners[index - 1];
		
		airConditioner.powerOff();
		System.out.println(airConditioner.getProductName() + "에어컨 전원을 끕니다.");
	}
	
	public void selectedAllOn() {
		
		System.out.println("전체 전원을 켭니다.");
		
		for(AirConditioner airConditioner : airConditioners) {
			airConditioner.powerOn();
		}
		
	}
	
	public void selectedAllOff() {
		
		System.out.println("전체 전원을 끕니다.");
		
		for(AirConditioner airConditioner : airConditioners) {
			airConditioner.powerOff();
		}
		
	}
	
}
















