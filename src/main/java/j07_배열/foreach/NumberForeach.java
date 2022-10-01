package j07_배열.foreach;

public class NumberForeach {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5,6,7,8,9,10}; //o
		int[] nums2 = {1,2,3,4,5,6,7,8,9,10}; //x
		
//		System.out.println(new int[] {1,2,3,4,5,6,7,8,9,10});
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("-----------<< foreach >>-----------");
		
		for(int a : nums) {
			System.out.println(a);
		}
		
	}
	
}
