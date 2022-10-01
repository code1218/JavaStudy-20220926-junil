package j10_인터페이스;

public interface InterfaceTest {
	public void test();
	
	public default void test1() {
		System.out.println("test1 메소드 실행");
	}
}
