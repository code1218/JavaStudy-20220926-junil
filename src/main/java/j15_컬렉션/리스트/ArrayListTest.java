package j15_컬렉션.리스트;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ArrayListTest {
    private String[] nameArray = new String[0];

    public void add(String name) {
        String[] tempArray = new String[nameArray.length + 1];
        for(int i = 0; i < nameArray.length; i++) {
            tempArray[i] = nameArray[i];
        }
        tempArray[tempArray.length - 1] = name;
        nameArray = tempArray;
    }

    public String nameArrayToString() {
        String str = null;

        str = "[";
        for(int i = 0; i < nameArray.length; i++) {
            str += nameArray[i];
            if(i != nameArray.length - 1) {
                str += ", ";
            }
        }
        str += "]";

        return str;
    }

    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("김준일");
        nameList.add("고희주");
        nameList.add("서채연");
        nameList.add("손민재");
        nameList.add("이진서");
        nameList.add("박창우");
        nameList.add("김효린");
        nameList.add("손예솔");
        System.out.println(nameList);

        ArrayListTest arrayListTest = new ArrayListTest();
        arrayListTest.add("김준일");
        arrayListTest.add("고희주");
        arrayListTest.add("서채연");
        arrayListTest.add("손민재");
        arrayListTest.add("이진서");
        arrayListTest.add("박창우");
        arrayListTest.add("김효린");
        arrayListTest.add("손예솔");

        System.out.println(arrayListTest.nameArrayToString());
    }

}
