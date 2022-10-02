package j13_스태틱.싱글톤;

public class KIA {
    private static KIA instance = null;

    private int serialNumber = 20220000;

    private KIA() {}

    public static KIA getInstance() {
        if(instance == null){
            instance = new KIA();
        }
        return instance;
    }

    public Car createCar(String modelName, String color) {
        return new Car(serialNumber++, getClass().getSimpleName(), modelName, color);
    }
}












