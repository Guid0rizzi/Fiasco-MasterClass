package Intermediate.Inheritance;

import Intermediate.ObjectsAndClasses.Ninja;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 18;
        naruto.nome = "Naruto";
        naruto.ApresentacaoNinja(naruto.nome);
        naruto.ModoSabio();
        System.out.println(naruto.IdadeParaSerHokage(30));
        //----------------------------------------------------------------//
        Uchiha sasuke = new Uchiha();
        naruto.aldeia = "Aldeia da folha";
        sasuke.idade = 32;
        sasuke.nome = "Sasuke";
        sasuke.SharinganAtivado();
        /*
        O Naruto não era para estar puxando a metodo de sharingan, solucionaremos isso com herança
        * */

    }
}
