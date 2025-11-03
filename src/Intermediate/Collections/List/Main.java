package Intermediate.Collections.List;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Array são estaticos = nunca alteram de tamanho
        String [] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        System.out.println(ninjasArray[0]);


        //Listas não são estaticas, elas podem aumentar e diminuir
        //adicionar elementos
        ArrayList<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Hashirama Senju");
        ninjasList.add("Tobirama Senju");
        ninjasList.add("Kakashi Hatake");
        //remover elementos
        System.out.println("Ninjas: "+ ninjasList);
        ninjasList.remove("Kakashi Hatake");
        System.out.println("Ninjas: "+ ninjasList);

        //trocar elemento
        ninjasList.set(2, "Minato Namikaze");
        System.out.println("Ninjas: "+ ninjasList);
        //ver o tamanho da lista
        System.out.println("tamanho da lista: "+ninjasList.size());
    }
}
