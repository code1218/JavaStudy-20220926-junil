package j06_클래스.캡슐화;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		//입력을 위해서 선언 및 초기화(Scanner 객체 생성)
		Scanner scanner = new Scanner(System.in);
		
		// BoardService 객체 생성(서비스 레이어, 로직)
		BoardService boardService = new BoardService();
		
		// select 변수 선언 후 null로 초기화
		String select = null;
		
		// 프로그램 전체 반복을 통해 원하는 시점에 프로그램을 종료시키는 원리
		while(true) {
			System.out.println("[ 게시글 관리 프로그램 ]");
			System.out.println("c. 게시글 작성");
			System.out.println("r. 게시글 조회");
			System.out.println("u. 게시글 수정");
			System.out.println("d. 게시글 삭제");
			System.out.println("q. 프로그램 종료");
			
			System.out.print("메뉴를 선택하세요: ");
			select = scanner.nextLine();
			
			if(select.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(select.equals("c")) {
				boardService.create();
				
			}else if(select.equals("r")) {
				boardService.read();
				
			}else if(select.equals("u")) {
				boardService.update();
				
			}else if(select.equals("d")) {
				boardService.delete();
				
			}else {
				System.out.println("선택하신 메뉴는 지원하지 않습니다.");
				System.out.println("다시 입력하세요.");
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("[ 프로그램 종료 ]");
		
		
	}

}














