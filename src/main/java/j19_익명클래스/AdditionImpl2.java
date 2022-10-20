package j19_익명클래스;

public class AdditionImpl2 implements Addition1 {

    @Override
    public int calc(int[] numbers) {
        int result = 0;

        for (int number : numbers) {
            result += number * 2;
        }

        return result;
    }

}
