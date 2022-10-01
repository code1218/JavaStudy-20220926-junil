package j06_클래스.access;

import j06_클래스.access1.AccessModifier1;
import j06_클래스.access1.AccessModifier2;

public class AccessMain {

	public static void main(String[] args) {
		AccessModifier2 am2 = new AccessModifier2();
		
		AccessModifier1 accessModifier1 = new AccessModifier1();
		accessModifier1.run();
		
		AccessModifier1 am1 = am2.test();
		am1.run();
	}

}
