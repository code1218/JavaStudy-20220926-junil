package j18_예외처리;

import java.util.ArrayList;
import java.util.List;

public class ThrowsMain {
    public int count(List<Integer> nums) throws Exception {
        int count = 0;

        for (int i = 0; i < nums.size() + 1; i++) {
            if(nums.get(i) != 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        ThrowsMain throwsMain = new ThrowsMain();

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(0);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        int count = 0;

        try {
            count = throwsMain.count(nums);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("count: " + count);




    }
}
