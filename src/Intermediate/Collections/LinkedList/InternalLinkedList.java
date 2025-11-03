package Intermediate.Collections.LinkedList;
import java.util.LinkedList;

public class InternalLinkedList {
    public static void main(String[] args) {
        LinkedList<String>  linkedList = new LinkedList<>();
        linkedList.add("XUXA");
        linkedList.add("PELE");
        linkedList.add("CADEIRANTE");
        linkedList.add("GUI HOMOSEXUAL");
        linkedList.add("DOBECK DO BECK");
        linkedList.pop();
        System.out.println(linkedList.peek());
        //linkedList.clear(); limpa tudo
        System.out.println(linkedList);
    }
}
