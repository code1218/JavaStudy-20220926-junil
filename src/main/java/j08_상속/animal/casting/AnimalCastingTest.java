package j08_상속.animal.casting;

import j08_상속.animal.Animal;
import j08_상속.animal.Human;
import j08_상속.animal.Tiger;

public class AnimalCastingTest {
	
	public static void main(String[] args) {
		/*
		 * upcasting(업캐스팅)
		 * 부모 자료형 변수에 자식 객체를 대입하는 것(형변환)
		 */
		Animal a = new Animal();
		Animal h = new Human();
		Animal t = new Tiger();
		
		a.move();
		h.move();
		t.move();
		
//		char c = 'a';
//		int i = c;
//		char c2 = (char) i;
		
		Human dh = (Human) h;
		dh.readBooks();
		
//		Human da = (Human) a;
//		da.readBooks();
		
		
		System.out.println();
		System.out.println("========<< 배열사용 >>========");
		
		Animal[] animals = new Animal[3];
		animals[0] = new Animal();
		animals[1] = new Human();
		animals[2] = new Tiger();
		
		for(Animal animal : animals) {
			animal.move();
		}
		
		System.out.println("========<< 다운캐스팅 >>========");
		
		for(Animal animal : animals) {
			if(animal.getClass() == Human.class) {
				Human hh = (Human) animal;
				hh.readBooks();		
				
			}else if(animal instanceof Tiger) {
				Tiger tt = (Tiger) animal;
				tt.hunting();
				
			}else {
				System.out.println("animal은 downcasting 할 수 없습니다.");
			}
		}
		
		
		
	}

}








