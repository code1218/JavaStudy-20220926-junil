package j14_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

// 응답
@AllArgsConstructor
@Data
public class ResponseData<T> {
    private int code;
    private String msg;
    private T data;
}
