package Intermediate.Generics.noGeneric;

public class Main {
    public static void main(String[] args) {
        Kunai kunai1 = new Kunai("Kunai normal");
        Kunai kunai2 = new Kunai("Kunai com Hiraishin ");
        Kunai kunai3 = new Kunai("Kunai multiplicada");
        KunaiPack kunaiPack = new KunaiPack();
        kunaiPack.addKunais(kunai1);
        kunaiPack.addKunais(kunai2);
        kunaiPack.addKunais(kunai3);
        System.out.println(kunaiPack);
    }
}
