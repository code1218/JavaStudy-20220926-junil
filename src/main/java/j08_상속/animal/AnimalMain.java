package j08_상속.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.move();
		
		System.out.println();
		
		Human human = new Human();
		human.move();
		
		System.out.println();
		
		Tiger tiger = new Tiger();
		tiger.move();

	}

}
