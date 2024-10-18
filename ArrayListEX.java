import java.util.ArrayList;
import java.util.List;


public class ArrayListEX {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();

        arrList.add("abc");
        arrList.add("bb");
        arrList.add("cc");

        System.out.println(arrList);
        System.out.println(arrList.get(1));

        arrList.add(1, "ee");
        System.out.println(arrList);

        arrList.remove(2);
        System.out.println(arrList);

        System.out.println(arrList.contains("bb"));
        System.out.println(arrList.contains("cc"));

        System.out.println(arrList.size());

        arrList.clear();
        System.out.println(arrList);
    }
}

//TASK
//Work the same thing on the integer array with duplicate elements 
//Check for printing thing if it workds for the integer array
