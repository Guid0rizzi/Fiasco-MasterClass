package Intermediate.Generics.withGenerics;

public class Main {
    public static void main(String[] args) {
        NinjaEquipament kunai = new NinjaEquipament("Kunai");
        NinjaEquipament estrelaNinja= new NinjaEquipament("Estrela ninja");
        NinjaEquipament pergaminho= new NinjaEquipament("Pergaminho");
        GenericPack<NinjaEquipament> bolsaGenerica = new GenericPack<>();
        bolsaGenerica.addEquipaments(kunai);
        bolsaGenerica.addEquipaments(estrelaNinja);
        bolsaGenerica.addEquipaments(pergaminho);
        bolsaGenerica.showEquipaments();
        System.out.println(bolsaGenerica);
    }


}
