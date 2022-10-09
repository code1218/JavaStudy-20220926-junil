package j18_예외처리;

public class ArrayException {

    public static void main(String[] args) {

        int[] numArray = new int[]{1,2,3,4,5,6,7,8,9,10};

        try {   // 예외가 일어날 수 있는 부분을 묶어준다.
            for (int i = 0; i < 11; i++) {
                System.out.print("인덱스: " + i);
                System.out.print(", ");
                System.out.println("값: " + numArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 크기를 벗어났습니다.");
        }

        System.out.println("프로그램 정상 종료");

    }

}
