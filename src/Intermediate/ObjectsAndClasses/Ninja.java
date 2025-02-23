package Intermediate.ObjectsAndClasses;

public class Ninja {
    String nome;
    Integer idade;
    Double altura;
    public void SharinganAtivado(){
        System.out.println("Sharingan Ativado");
    }
    public String ApresentacaoNinja(String nome){
        return "o nome nome é "+ nome;
    }
    public Integer IdadeParaSerHokage (int idadeMinimaParaSerHokage){
        return  idadeMinimaParaSerHokage - idade;
    }
}
