package j13_스태틱.싱글톤;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton.memberMethod();
        singleton2.memberMethod();

    }

}
