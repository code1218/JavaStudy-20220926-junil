package j17_빌더패턴;

public class UserBuilderMain {

    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .password("1234")
                .username("junil")
                .name("준일")
                .build();

        System.out.println(user);
    }
}
