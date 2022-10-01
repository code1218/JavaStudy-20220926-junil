package j07_배열;

public class NumberArray2 {

	public static void main(String[] args) {
		
		int[] numArray = new int[10];
		
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] = i * 10;
		}
		
		for(int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		

	}

}
