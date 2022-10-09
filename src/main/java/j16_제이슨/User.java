package j16_제이슨;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@AllArgsConstructor
@Data
public class User {
    @Expose(serialize = true)
    private int id;
    @Expose(serialize = true)
    private String username;
    @Expose(serialize = false)
    private String password;
    @Expose(serialize = true)
    private String email;
    @Expose(serialize = true)
    private String name;
    @Expose(serialize = true)
    private String phone;
    @Expose(serialize = true)
    private List<String> hobby;
}
