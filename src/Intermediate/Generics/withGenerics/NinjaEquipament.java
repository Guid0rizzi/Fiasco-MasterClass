package Intermediate.Generics.withGenerics;

public class NinjaEquipament {
    String nome;
    public NinjaEquipament(){}
    public NinjaEquipament(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "equipament: "+ nome ;
    }
}
