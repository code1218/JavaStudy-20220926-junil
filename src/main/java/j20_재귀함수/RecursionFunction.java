package j20_재귀함수;

public class RecursionFunction {
    public static void main(String[] args) {
        printText("안녕", 10);
    }

    public static void printText(String str, int i) {
        if(i == 0) return;

        System.out.println("index[" + i + "] -> " + str);
        printText(str, i - 1);
    }
}
