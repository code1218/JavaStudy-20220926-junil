package j10_인터페이스.IntegratedControl;

import java.util.Scanner;

//통합제어
public class IntegratedController {

	public static void main(String[] args) {
		IntegratedControlService service = new IntegratedControlService();
		
		Scanner scanner = new Scanner(System.in);
		String cmd = null;
		
		while(true) {
			System.out.println("[ 통합제어 프로그램 ]");
			System.out.println("1. 에어컨 생성");
			System.out.println("2. 에어컨 전원 켜기(선택)");
			System.out.println("3. 에어컨 전원 끄기(선택)");
			System.out.println("4. 에어컨 전원 켜기(통합)");
			System.out.println("5. 에어컨 전원 끄기(통합)");
			System.out.println("q. 프로그램 종료");
			System.out.println("================================");
			System.out.print("메뉴 선택: ");
			cmd = scanner.nextLine();
			
			if(cmd.equals("q")) {
				System.out.println("프로그램 종료.");
				break;
				
			}else if(cmd.equals("1")) {
				System.out.print("몇대의 에어컨을 생성하시겠습니까? ");
				service.init(scanner.nextInt());
				scanner.nextLine();
				
			}else if(cmd.equals("2")) {
				service.showAirConditionersStatus();
				int count = service.getAirConditionersSize();
				
				while(true) {
					System.out.print("몇번째 에어컨을 켜시겠습니까? ");
					int selected = scanner.nextInt();
					scanner.nextLine();
					
					if(selected > 0 && selected < count + 1) {
						service.selectedOn(selected);	
						break;
					}else {
						System.out.println("다시 입력하세요.");
					}
					
				}
				
			}else if(cmd.equals("3")) {
				service.showAirConditionersStatus();
				int count = service.getAirConditionersSize();
				
				while(true) {
					System.out.print("몇번째 에어컨을 끄시겠습니까? ");
					int selected = scanner.nextInt();
					scanner.nextLine();
					
					if(selected > 0 && selected < count + 1) {
						service.selectedOff(selected);	
						break;
					}else {
						System.out.println("다시 입력하세요.");
					}
					
				}
				
			}else if(cmd.equals("4")) {
				service.selectedAllOn();
				
			}else if(cmd.equals("5")) {
				service.selectedAllOff();
				
			}else {
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
		

	}

}







