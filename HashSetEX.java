import java.util.HashSet;
import java.util.Set;


public class HashSetEX {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        // Will be in the end since it was added afterwards
        hashSet.add("abc");
        hashSet.add("aa");
        hashSet.add("bb");
        hashSet.add("cc");

        // Does not allow the duplicate
        hashSet.add("cc");

        hashSet.add(null);
        System.out.println(hashSet);

        hashSet.remove("cc");
        System.out.println(hashSet);

        System.out.println(hashSet.contains("bb"));

        for(String names:hashSet){
            System.out.println(names);
        }

        System.out.println(hashSet.size());

        //Adding multiple elemets from multiple collection

        Set<String> anotherSet = new HashSet<>();

        anotherSet.add("a");
        anotherSet.add("b");
        anotherSet.add("c");

        // this method is bascially used for the concatenation 
        hashSet.addAll(anotherSet);

        System.out.println(hashSet);

        hashSet.clear();
        System.out.println(hashSet.isEmpty());

        //Is indexing possible in set or not?
        /* It can be achived by converting hash set to arrayList
         * in order to do indexing, using typecasting
         */

    }
}
