package j07_배열.foreach;

public class NumberForeach2 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		
//		for(int num : nums) {
//			num = 1;
//		}
		
		for(int num : nums) {
			System.out.println(num);
		}

	}

}
