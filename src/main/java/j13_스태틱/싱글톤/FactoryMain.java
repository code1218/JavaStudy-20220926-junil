package j13_스태틱.싱글톤;

public class FactoryMain {
    public static void main(String[] args) {
        Factory[] factories = new Factory[5];

        for(int i = 0; i < factories.length; i++) {
            factories[i] = new Factory(i + 1);
            for(int j = 0; j < 15; j++) {
                factories[i].addCar();
            }
            System.out.println();
        }
    }
}
