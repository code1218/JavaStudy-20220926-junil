package j06_클래스.캡슐화;

import java.time.LocalDateTime;
import java.util.Scanner;

public class BoardService {
	
	private Board board;
	private Scanner scanner;
	
	public BoardService() {
		scanner = new Scanner(System.in);
	}
	
	public void create() {
		String title = null;
		String writer = null;
		String content = null;
		
		System.out.println("[ 게시글 작성 ]");
		if(board != null) {
			System.out.println("더 이상 게시글을 작성 할 수 없습니다.");
			System.out.println("삭제 후 작성해주세요.");
			return;
		}
		
		System.out.print("제목: ");
		title = scanner.nextLine();
		System.out.print("작성자: ");
		writer = scanner.nextLine();
		System.out.print("내용: ");
		content = scanner.nextLine();
		
		board = new Board(1, title, writer, content, LocalDateTime.now(), 0);

	}
	
	public void read() {
		System.out.println("[ 게시글 조회 ]");
		if(board == null) {
			System.out.println("작성한 게시글이 없습니다.");
		}else {
			int boardCount = board.getCount();
			board.setCount(++boardCount);
			
			System.out.println(board.toString());
		}
	}
	
	public void update() {
		System.out.println("[ 게시글 수정 ]");
		if(board == null) {
			System.out.println("수정할 게시글이 없습니다.");
			return;
		}
		System.out.print("제목: ");
		board.setTitle(scanner.nextLine());
		System.out.print("작성자: ");
		board.setWriter(scanner.nextLine());
		System.out.print("내용: ");
		board.setContent(scanner.nextLine());
		
		System.out.println();
		System.out.println("게시글 수정 완료.");
	}
	
	public void delete() {
		System.out.println("[ 게시글 삭제 ]");
		if(board == null) {
			System.out.println("삭제할 게시글이 없습니다.");
			return;
		}
		
		board = null;
		System.out.println("게시글을 삭제하였습니다.");
	}
}












