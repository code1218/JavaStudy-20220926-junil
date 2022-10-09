package j17_빌더패턴;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
public class User {
    private String username;
    private String password;
    private String name;
    private String email;
/*

    public User(UserBuilder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.name = builder.name;
        this.email = builder.email;
    }

    public static class UserBuilder {
        private String username;
        private String password;
        private String name;
        private String email;

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }
        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }
        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

*/

}
