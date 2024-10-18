import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetEX {
    public static void main(String[] args) {
        Set<String> thishashSet = new LinkedHashSet<>();

        thishashSet.add("abc");
        thishashSet.add("aa");
        thishashSet.add("bb");
        thishashSet.add("cc");

        thishashSet.add(null);
        System.out.println(thishashSet);

        thishashSet.remove("cc");
        System.out.println(thishashSet);

        System.out.println(thishashSet.contains("bb"));

        for(String names:thishashSet){
            System.out.println(names);
        }

        System.out.println(thishashSet.size());

        List<String> convertedArray = new ArrayList<>(thishashSet);
        System.out.println("After the conversion");
        System.out.println(convertedArray);

        convertedArray.add(0, "ahh");
        convertedArray.remove(4);
        System.out.println(convertedArray);



        //Adding multiple elemets from multiple collection

        Set<String> anotherSet = new LinkedHashSet<>();

        anotherSet.add("a");
        anotherSet.add("b");
        anotherSet.add("c");

        // this method is bascially used for the concatenation 
        thishashSet.addAll(anotherSet);

        System.out.println(thishashSet);

        thishashSet.clear();
        System.out.println(thishashSet.isEmpty());

        //Is indexing possible in set or not?
        /* It can be achived by converting hash set to arrayList
         * in order to do indexing, using typecasting
         */

    }
}

//TASK 1
// Convert arrayList to linkedList - perform indexing operation 
// Tree Set 
