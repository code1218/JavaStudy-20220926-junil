package j22_유용한객체;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class StringClassMethod {

    public static void main(String[] args) {
//        String address = new String("부산 동래구 사직동");
        String address = "부산 동래구 사직동";
        String name = "JunilKim";

        boolean containsResult = address.contains("부산");
        printResult("contains", containsResult);

        byte[] getBytesResult = address.getBytes(StandardCharsets.UTF_8);
        printResult("getBytes", new String(getBytesResult, StandardCharsets.UTF_8));

        String toLowerCaseResult = name.toLowerCase(Locale.ROOT);
        printResult("toLowerCase", toLowerCaseResult);

        String toUpperCaseResult = name.toUpperCase(Locale.ROOT);
        printResult("toUpperCase", toUpperCaseResult);

        char charAtResult = address.charAt(0);
        printResult("charAt", charAtResult);

        String concatResult = address.concat(" 중앙대로");
        printResult("concat", concatResult);

        String[] roles = new String[] {
                "ROLE_USER",
                "ROLE_GROUP",
                "MASTER",
                "OWNER",
                "ROLE_MANAGER",
                "ROLE_ADMIN"
        };
        List<String> roleList = new ArrayList<String>();

        forEach(role -> {
            String roleName = (String) role;
            if(roleName.startsWith("ROLE_")) {
                roleName = roleName.substring(roleName.indexOf("_") + 1);
            }
            roleList.add(roleName);
        }, roles);

        printResult("startsWith", roleList);

        String substringResult = address.substring(0, 5);
        printResult("substring", substringResult);

        int indexOfResult = address.indexOf(" ");
        printResult("indexOf", indexOfResult);

        int lastIndexOfResult = address.lastIndexOf(" ");
        printResult("lastIndexOf", lastIndexOfResult);

        // 확장자 .jpg .exe .png
        List<String> extensions = new ArrayList<String>();
        extensions.add("a.jpg");
        extensions.add("b.jpg");
        extensions.add("c.jpg");
        extensions.add("d.jpg");
        extensions.add("e.jpg");
        extensions.add("f.exe");

        extensions.forEach(extension -> {
            if(!extension.endsWith(".jpg")){
                System.out.println(extension + "은(는) 사용할 수 없는 파일형식입니다.");
            }
        });

        boolean equalsIgnoreCaseResult = name.equalsIgnoreCase("junilkim");
        printResult("equalsIgnoreCase", equalsIgnoreCaseResult);

        String str = "   ";

        boolean isBlankResult = str.isBlank();
        printResult("isBlank", isBlankResult);

        boolean isEmptyResult = str.isEmpty();
        printResult("isEmpty", isEmptyResult);

        String replaceAllResult = address.replaceAll(" ", "-");
        printResult("replaceAll", replaceAllResult);

        String[] phoneNumbers = new String[] {
                "010-9988-1916",
                "010/1234/5678",
                "010 2222 3333",
                "01055556666"
        };

        List<String> phoneNumberList = new ArrayList<String>();

        for(int i = 0; i < phoneNumbers.length; i++) {
            String phone = phoneNumbers[i];

            phone = phone.replaceAll("/", "")
                    .replaceAll(" ", "")
                    .replaceAll("-", "");

            phoneNumberList.add(phone);
        }

        printResult("replaceAll", phoneNumberList);

        String names = "김준일, 이상진, 서채연, 손민재, 이진서, 박창우";

        String[] nameArray = names.split(", ");
        forEach(nameText -> {
            System.out.println(nameText);
        }, nameArray);

        System.out.println();

        Arrays.asList(nameArray).forEach(nameText -> {
            System.out.println(nameText);
        });

    }



    public static void printResult(String methodName, Object result) {
        System.out.println("--------------------------------");
        System.out.println(methodName + " 결과 >>> " + result);
        System.out.println("--------------------------------");
    }

    public static void forEach(Consumer<Object> consumer, Object[] values) {
        for(Object value : values) {
            consumer.accept(value);
        }
    }

}
