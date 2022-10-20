package j21_람다식;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Calc anonymousAddition = new Calc() {
            @Override
            public Integer operator(Integer[] dataArray) {
                int result = 0;
                for(int data : dataArray) {
                    result += data;
                }
                return result;
            }
        };

        Calc lambdaAddition = nums -> {
            int result = 0;
            for(int data : nums) {
                result += data;
            }
            return result;
        };

        Calc lambdaMultiplication = nums -> {
            int result = 1;
            for(int data : nums) {
                result *= data;
            }
            return result;
        };

        Integer[] numbers = new Integer[] {1,2,3,4,5,6,7,8,9,10};

        int result1 = anonymousAddition.operator(numbers);
        System.out.println("결과1: " + result1);

        int result2 = lambdaAddition.operator(numbers);
        System.out.println("결과2: " + result2);

        int result3 = lambdaMultiplication.operator(numbers);
        System.out.println("결과3: " + result3);

    }

}
