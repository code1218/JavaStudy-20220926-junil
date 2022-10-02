package j14_제네릭;

import java.util.ArrayList;
import java.util.List;

public class GenericMain {
    public static void main(String[] args) {
        Controller controller = new Controller();

        System.out.println(controller.getName(5));

        List<String> nameList = new ArrayList<String>();
        for(int i = 0; i < 100; i++) {
            nameList.add("김준일" + (i + 1));
        }

        nameList.forEach(name -> {
            System.out.println("이름: " + name);
        });
    }
}
