package j13_스태틱.싱글톤;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void memberMethod() {
        System.out.println("싱글톤 객체의 맴버 메소드 호출");
    }

}
