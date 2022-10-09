package j15_컬렉션.리스트;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod2 {

    /*
    [1반]
    김준일
    임자빈
    김기덕
    장은화
    김규민
    임지현
    노희수
    정빈
    김장현
    박경효
/*
[2반]
        김준일
        신경수
        구도하
        이상진
        고희주
        서채연
        손민재
        이진서
        박창우
        */

    //1. 1반과 2반을 하나의 클래스로 묶어라
    //2. 리스트에 포함된 김준일을 전부 삭제해라
    //3. 2반의 모든 학생들을 삭제해라
    //4. 임지현 학생의 위치를 찾아 get()해라(출력)

    public static void main(String[] args) {
        String[] class1 = new String[] {"김준일", "임자빈", "김기덕", "장은화", "김규민", "임지현", "노희수",
                "정빈","김장현","박경효"};
        String[] class2= new String[] {
                "김준일",
                "신경수",
                "구도하",
                "이상진",
                "고희주",
                "서채연",
                "손민재",
                "이진서",
                "박창우"
        };;
        ArrayList<String> classList = new ArrayList<String>();
        classList.addAll(Arrays.asList(class1));
        classList.addAll(Arrays.asList(class2));
        System.out.println(classList);

        while(classList.contains("김준일")){
            classList.remove("김준일");
        }

        System.out.println("2번문제");
        System.out.println(classList);
        System.out.println();

        classList.removeAll(Arrays.asList(class2));
        System.out.println("3번문제");
        System.out.println(classList);
        System.out.println();

        System.out.println("4번문제");
        int index = classList.indexOf("임지현2");
        System.out.println("인덱스번호: " + index);
        if(index != -1){
            String name1 = classList.get(index);
            System.out.println(name1);
        }



    }


}
