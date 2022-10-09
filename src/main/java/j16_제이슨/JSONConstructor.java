package j16_제이슨;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JSONConstructor {
    public static void main(String[] args) {
        Gson gson1 = new Gson();

        Gson gson2 = new GsonBuilder()
                .serializeNulls()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .setPrettyPrinting()
                .create();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("이름", null);
        map.put("아이디", "junil");
        map.put("아이디2", "junil2");
        map.put("아이디3", "junil3");
        map.put("아이디4", "junil4");
        map.put("아이디5", "junil5");
        map.put("오늘날짜", new Date());

        String jsonText1 = gson1.toJson(map);
        System.out.println(jsonText1);

        String jsonText2 = gson2.toJson(map);
        System.out.println(jsonText2);
    }
}










