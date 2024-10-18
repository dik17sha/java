import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapHW {
    public static void main(String[] args) {
        //Here, String is the KEY and the Interger here in the VALUE
        Map<String, Integer> hashmap = new LinkedHashMap<>();

        //In map use PUT method 
        hashmap.put("a",10);
        hashmap.put("b",20);
        hashmap.put("c",30);

        hashmap.put("a", 40);

        System.out.println(hashmap);

        hashmap.put(null, 50);
        hashmap.put(null, 60);

        hashmap.put("d", null);
        hashmap.put("e", null);

        System.out.println(hashmap);

        System.out.println(hashmap.get("b"));

        System.out.println(hashmap.containsKey("e"));
        System.out.println(hashmap.containsValue(30));

        hashmap.remove("a");
        System.out.println(hashmap);

        System.out.println(hashmap.size());

        //Iteration
        for(Map.Entry<String,Integer> entry : hashmap.entrySet()){
            System.out.println("key: " + entry.getKey() + " , value: " + entry.getValue());
        }

        hashmap.replace("c", 50);
        System.out.println(hashmap);

        hashmap.putIfAbsent("g", 60);
        System.out.println(hashmap);

    }
}

