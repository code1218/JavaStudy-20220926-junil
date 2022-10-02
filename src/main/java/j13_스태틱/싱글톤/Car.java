package j13_스태틱.싱글톤;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {
    private int serialNumber;
    private String company;
    private String modelName;
    private String color;
}
