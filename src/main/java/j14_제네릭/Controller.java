package j14_제네릭;

public class Controller {
    String[] names = new String[]{"김준일", "임자빈", "김규민", "임지현", "노희수"};

    public ResponseData<?> getName(int i) {
        if(i < names.length) {
            return new ResponseData<>(1, "이름을 반환합니다.", names[i]);
        }else {
            return new ResponseData<>(-1, "해당 인덱스의 위치에는 이름이 등록되어 있지 않습니다.", -1);
        }
    }
}
