import java.util.TreeSet;
import java.util.Set;

public class TreeSetEX {
    public static void main(String[] args) {
        Set<String> thisTree = new TreeSet<>();

        thisTree.add("oo");
        thisTree.add("jj");
        thisTree.add("aa");
        thisTree.add("nn");
        thisTree.add("ee");

        System.out.println(thisTree);

        System.out.println(thisTree.size());

        System.out.println(thisTree.contains("bb"));

        for(String names:thisTree){
            System.out.println(names);
        }



    }
    
}
