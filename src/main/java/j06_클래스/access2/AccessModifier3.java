package j06_클래스.access2;

public class AccessModifier3 {
	private String title;
	private String content;
	private int count;
	
	//생성자를 통한 값 주입
	public AccessModifier3(String title, String content, int count) {
		this.title = title;
		this.content = content;
		this.count = count;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void print() {
		System.out.println("제목: " + title);
		System.out.println("내용: " + content);
		System.out.println("조회수: " + count);
	}
}






