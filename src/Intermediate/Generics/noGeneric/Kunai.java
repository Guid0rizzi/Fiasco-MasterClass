package Intermediate.Generics.noGeneric;

public class Kunai {
    private String name;
   public Kunai (String name){
       this.name = name;
   }
   public void setName(String name){
       this.name = name;
    }
    public String getName(){
       return this.name;
    }
    @Override
    public String toString(){
       return "Kunai:"+ name;
    }
}
