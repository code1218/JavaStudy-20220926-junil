package j10_인터페이스.IntegratedControl;

public abstract class AirConditioner implements Power {
	private String company;
	private int serialNumber;
	private String productName;
	private boolean powerStatus;
	
	public AirConditioner(String company, int serialNumber, String productName) {
		super();
		this.company = company;
		this.serialNumber = serialNumber;
		this.productName = productName;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public boolean isPowerStatus() {
		return powerStatus;
	}

	@Override
	public void powerOn() {
		System.out.println(company + " 에어컨을 켭니다.");
		powerStatus = true;
	}
	
	@Override
	public void powerOff() {
		System.out.println(company + " 에어컨을 끕니다.");
		powerStatus = false;
	}
}













