package j15_컬렉션.세트;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        // 값 추가
        set.add("김준일");
        set.add("임자빈");
        set.add("김기덕");
        set.add("장은화");
        set.add("김규민");
        set.add("임지현");
        System.out.println(set);

        // addAll
        String[] names = new String[]{"김준일", "김준일", "김기덕", "손민재"};
        set.addAll(Arrays.asList(names));
        System.out.println(set);

        // 값 조회
        // 1. foreach
        for(String name : set) {
            System.out.println(name);
        }
        System.out.println();

        // 2. iterator
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
