package j09_추상;

public class AnimalMain {

	public static void main(String[] args) {
		Animal h = new Human();
		
		h.move();
		
		String eatMassage = h.eat("치킨");
		System.out.println(eatMassage);
		
		h.sleep();

	}

}
