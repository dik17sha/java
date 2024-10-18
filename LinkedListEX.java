import java.util.LinkedList;


public class LinkedListEX {
    public static void main(String[] args) {
        
        LinkedList <String> linkedList = new LinkedList<> ();

        linkedList.add("abc");
        linkedList.add("cc");
        linkedList.add("bb");

        System.out.println(linkedList);

        linkedList.addFirst("aa");
        System.out.println(linkedList);

        linkedList.addLast("ee");
        System.out.println(linkedList);

        linkedList.add(2, "ff");
        System.out.println(linkedList);

        System.out.println(linkedList.get(2));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());


        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove(2);
        System.out.println(linkedList);

        System.out.println(linkedList.contains("ffd"));

        // set is updating
        linkedList.set(0, "aa");

        System.out.println(linkedList.size());

        for(String name : linkedList){
            System.out.println(name);
        }

        linkedList.clear();
        System.out.println(linkedList.isEmpty());

    }
}

//TASK
// Do the same thing but for the integer LinkedList