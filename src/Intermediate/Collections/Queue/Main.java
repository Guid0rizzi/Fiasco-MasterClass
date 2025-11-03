package Intermediate.Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> ninjaQueue = new LinkedList<>();
        ninjaQueue.add("Naruto");
        ninjaQueue.add("Sasuke");
        ninjaQueue.add("Kakashi");
        ninjaQueue.add("Tobirama"); //first-in first-out
        System.out.println(ninjaQueue);
        System.out.println(ninjaQueue.poll());//vai tirar o head da minha fila
        System.out.println(ninjaQueue.peek());// pra ver quem o primeiro da suas fila, ou seja o head
        //não tem como tirar o ultimo da fila, ou seja o tail
    }
}
