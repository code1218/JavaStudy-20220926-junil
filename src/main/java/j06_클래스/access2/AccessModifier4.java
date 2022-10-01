package j06_클래스.access2;

public class AccessModifier4 {
	
	public static void main(String[] args) {
		AccessModifier3 accessModifier3 = new AccessModifier3("java기초", "java class study", 10);
		accessModifier3.print();
		
		accessModifier3.setTitle("java응용");
		accessModifier3.print();
	}
	
}
