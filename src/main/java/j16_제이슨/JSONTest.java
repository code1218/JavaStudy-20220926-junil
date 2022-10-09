package j16_제이슨;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class JSONTest {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        User user = new User(
                20220001,
                "junil",
                "1234",
                "skjil1218@kakao.com",
                "김준일",
                "01099881916",
                Arrays.asList(new String[] {"축구", "농구", "골프"})
        );


        String jsonText = gson.toJson(user);
        System.out.println(jsonText);

    }
}
