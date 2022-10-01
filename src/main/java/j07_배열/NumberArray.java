package j07_배열;


/**
 * 
 * 배열(Array)
 * 같은 자료형을 가진 메모리 공간을 묶어서 관리할 수 있는 방법
 * index(순서)를 가진다.
 * 
 * 
 */

public class NumberArray {

	public static void main(String[] args) {
		int[] numArray = new int[6];
		
		numArray[0] = 10;
		numArray[1] = 100;
		numArray[2] = 1000;
		numArray[3] = 10000;
		numArray[4] = 100000;
		numArray[5] = 1000000;
		
		System.out.println("index 0: " + numArray[0]);
		System.out.println("index 1: " + numArray[1]);
		System.out.println("index 2: " + numArray[2]);
		System.out.println("index 3: " + numArray[3]);
		System.out.println("index 4: " + numArray[4]);
		System.out.println("index 5: " + numArray[5]);
		
		for(int i = 0; i < 6; i++) {
			System.out.println("index " + i + ": " + numArray[i]);
		}

	}

}







