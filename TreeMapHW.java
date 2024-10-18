import java.util.TreeMap;
import java.util.Map;

public class TreeMapHW {
    public static void main(String[] args) {
        Map<String, Integer> treemap = new TreeMap<>();

        treemap.put("a",0);
        treemap.put("b", 10);
        treemap.put("c", 30);
        treemap.put("d", 20);

        System.out.println(treemap);

    }
}
