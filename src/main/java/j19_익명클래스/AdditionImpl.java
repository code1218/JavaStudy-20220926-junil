package j19_익명클래스;

public class AdditionImpl implements Addition1 {

    @Override
    public int calc(int[] numbers) {
        int result = 0;

        for (int number : numbers) {
            result += number;
        }

        return result;
    }

}
