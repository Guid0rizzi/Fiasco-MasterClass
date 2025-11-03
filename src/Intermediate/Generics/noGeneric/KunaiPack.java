package Intermediate.Generics.noGeneric;

import java.util.ArrayList;
import java.util.List;

public class KunaiPack {
    private List<Kunai> kunais;

    public void addKunais(Kunai kunai){
        kunais.add(kunai);
    }
    public KunaiPack(){
        this.kunais = new ArrayList<>();
    }

    public KunaiPack(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) {
        this.kunais = kunais;
    }
    @Override
    public String toString(){
        return "Kunais package: "+ kunais.toString();
    }
}
