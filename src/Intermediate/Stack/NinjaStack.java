package Intermediate.Stack;

import java.util.Stack;

public class NinjaStack {
    public static void main(String[] args) {
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.add("Naruto");
        ninjaStack.push("Sasuke");
        ninjaStack.push("Sakura");// push = adiciona ao topo da stack
        ninjaStack.push("Hinata");
        System.out.println(ninjaStack);
        ninjaStack.pop();
        System.out.println("Ninja stack atualizada com pop");
        System.out.println(ninjaStack);
        // em stack o ultimo que entrar é o primeiro a sair (last-in first-out lifo)
        System.out.println("tamanho do stack");
        System.out.println(ninjaStack.size());
        System.out.println("qual é o elemento que esta no topo");
        System.out.println(ninjaStack.peek());//verifica o elemento no topo da Stack sem removê-lo
    }
}
