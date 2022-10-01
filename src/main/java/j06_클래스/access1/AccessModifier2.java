package j06_클래스.access1;

public class AccessModifier2 {

	public AccessModifier1 test() {
		AccessModifier1 accessModifier1 = new AccessModifier1();
		accessModifier1.str = "문자열";
		accessModifier1.num = 1000;
		
		accessModifier1.run();
		
		return accessModifier1;
	}
	
}
