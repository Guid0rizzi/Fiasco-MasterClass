package Intermediate.Challenge;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //TODO: INICIAR UMA LINKEDLIST
        LinkedList<String> linkedList = new LinkedList<>();
        //TODO: ADICIONAR O NINJA NO INICIO DA LISTA
        linkedList.add("item1");
        linkedList.add("item2");
        linkedList.add("item3");
        linkedList.add("item4");
        linkedList.add("item5");
        linkedList.add("item6");
        linkedList.add("item7");
        System.out.println(linkedList);
        //TODO: REMOVER O NINJA NO INICIO DA LISTA
        linkedList.removeFirst();
        //TODO: LISTAR OS NINJAS
        System.out.println(linkedList);
        //TODO: PROCURAR UM NINJA POR INDICE
        String findPerIndex = linkedList.get(1);
        System.out.println(findPerIndex);
        //TODO: REMOVER E MOSTRAR O NINJA NO INICIO DA LISTA
        System.out.println(linkedList.poll());
        System.out.println(linkedList);
        //TODO: ADICIONAR O NINJA NO INICIO DA LISTA
        linkedList.addFirst("item adicionado no começo");
        System.out.println(linkedList);
        //TODO: ADICIONAR O NINJA NO FINAL DA LISTA
        linkedList.addLast("item adicionado no final");
        System.out.println(linkedList);

    }
}
