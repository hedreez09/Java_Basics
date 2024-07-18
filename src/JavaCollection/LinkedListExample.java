package JavaCollection;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Java");
        linkedList.add("python");
        linkedList.add("C#");
        linkedList.add("javaScript");
        System.out.println(linkedList);

        linkedList.add(2,"React");

        linkedList.remove(3);
        System.out.println(linkedList);
    }
}
