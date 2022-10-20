package j21_람다식;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceMain {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("김준일");
        names.add("임자빈");
        names.add("김기덕");
        names.add("장은화");
        names.add("임지현");
        names.add("노희수");
        names.add("정빈");

        // Runnable function
        Runnable printName = () -> {
            System.out.println("이름 출력 로직");
            names.forEach(name -> System.out.println(name));
        };

        printName.run();

        // Supplier function
        System.out.println();
        System.out.println("Supplier");
        for(int i = 0; i < names.size(); i++) {
            int finalI = i;
            Supplier<String> nameSupplier = () -> names.get(finalI);

            System.out.println(nameSupplier.get());
        }

        // Consumer function
        System.out.println();
        System.out.println("Consumer");
        Consumer<List<String>> consumer = nameList -> nameList.forEach(name -> System.out.println(name));

        consumer.accept(names);

        // Function function
        System.out.println();
        System.out.println("Function");
        Function<List<String>, String> function = nameList -> {
            String nameText = null;
            for(int i = 0; i < nameList.size(); i++) {
                if(i == 0) {
                    nameText = nameList.get(i);
                    continue;
                }
                nameText += ", " + nameList.get(i);
            }
            return nameText;
        };

        String nameText = function.apply(names);
        System.out.println(nameText);

        Predicate<String> contains = (name) -> name.contains("손민재");

        boolean flag = contains.test(nameText);
        System.out.println("이름포함유무: " + flag);

    }

}
