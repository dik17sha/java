import java.util.ArrayList;
import java.util.List;

public class ArrayListHW {
    public static void main(String[] args) {
        List<Integer> arrIntList = new ArrayList<>();
        
        //add method implementation
        arrIntList.add(1);
        arrIntList.add(22);
        arrIntList.add(333);

        System.out.println(arrIntList);
        //get method implementation
        System.out.println(arrIntList.get(1));

        //add using index 
        arrIntList.add(3,4444);
        System.out.println(arrIntList);

        arrIntList.remove(2);
        System.out.println(arrIntList);

        System.out.println(arrIntList.contains(333));
        System.out.println(arrIntList.contains(1));

        System.out.println(arrIntList.size());

        arrIntList.clear();
        System.out.println(arrIntList);
    }
    
}
