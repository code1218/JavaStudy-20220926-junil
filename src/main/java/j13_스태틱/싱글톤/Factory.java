package j13_스태틱.싱글톤;

import java.util.Random;

public class Factory {

    private Car[] cars;
    private int factoryNumber;
    private KIA kia;

    private String[] modelNames = new String[]{"k3", "k5", "k7", "k8", "k9"};
    private String[] colors = new String[]{"블랙", "화이트", "그레이", "레드", "블루"};

    public Factory(int factoryNumber) {
        this.factoryNumber = factoryNumber;
        cars = new Car[10];
        kia = KIA.getInstance();
    }

    public void addCar() {
        int index = findEmptyIndex();
        Random random = new Random();

        if(index == -1){
            System.out.println(factoryNumber + "공장은 더 이상 차량을 생산 할 수 없습니다.");
            return;
        }

        int randomIndex1 = random.nextInt(5);
        int randomIndex2 = random.nextInt(5);

        cars[index] = kia.createCar(modelNames[randomIndex1], colors[randomIndex2]);
        System.out.println("[ " + factoryNumber + "공장 생산차량 정보 ]");
        System.out.println(cars[index]);
    }

    private int findEmptyIndex() {
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] == null) {
                return i;
            }
        }

        return -1;
    }
}










