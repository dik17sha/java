import java.util.LinkedList;

public class LinkedListHW {
    public static void main(String[] args) {
        
        LinkedList <Integer> linkedList = new LinkedList<> ();

        linkedList.add(1);
        linkedList.add(22);
        linkedList.add(333);

        System.out.println(linkedList);

        linkedList.addFirst(0);
        System.out.println(linkedList);

        linkedList.addLast(4444);
        System.out.println(linkedList);

        linkedList.add(2, 21);
        System.out.println(linkedList);

        System.out.println(linkedList.get(2));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());


        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove(2);
        System.out.println(linkedList);

        System.out.println(linkedList.contains(12));

        // set is updating
        linkedList.set(1,22);

        System.out.println(linkedList.size());

        for(Integer name : linkedList){
            System.out.println(name);
        }

        linkedList.clear();
        System.out.println(linkedList.isEmpty());

    }
    
}