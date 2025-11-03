package Intermediate.Generics.withGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericPack<T>{
    private List<T> equipaments;
    public void addEquipaments(T equipament){
        equipaments.add(equipament);
    }
    public void showEquipaments(){
        for(T equipament: equipaments){ //obj:array
            System.out.println(equipament);
        }
    }

    public GenericPack(){
        this.equipaments = new ArrayList<>();
    }
    /*
    public GenericPack(){}
    public GenericPack(List<T> equipaments){
        this.equipaments = new ArrayList<>();
    }
    isso retornara esse erro abaixo porque o contrutor vai estar vazio logo retornara um null
    * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.List.add(Object)"
    * because "this.equipaments" is null at Intermediate.Generics.withGenerics.GenericPack.addEquipaments(GenericPack.java:9)
    * at Intermediate.Generics.withGenerics.Main.main(Main.java:9)
    * */

    public List<T> getEquipaments() {
        return equipaments;
    }

    public void setEquipaments(List<T> equipaments) {
        this.equipaments = equipaments;
    }

    @Override
    public String toString() {
        return "GenericPack:{"+ equipaments +'}';
    }
}



