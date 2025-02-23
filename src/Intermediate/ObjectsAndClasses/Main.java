package Intermediate.ObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Ninja naruto = new Ninja();
        naruto.altura = 1.80;
        naruto.idade = 18;
        naruto.nome = "Naruto";
        String nomeNinja = naruto.ApresentacaoNinja(naruto.nome);
        System.out.println(nomeNinja);
        System.out.println(naruto.IdadeParaSerHokage(30));
        //----------------------------------------------------------------//
        Ninja sasuke = new Ninja();
        sasuke.altura = 1.80;
        sasuke.idade = 32;
        sasuke.nome = "Sasuke";
        sasuke.SharinganAtivado();
        /*
        O Naruto não era para estar puxando a metodo de sharingan, solucionaremos isso com herança
        * */

    }
}
