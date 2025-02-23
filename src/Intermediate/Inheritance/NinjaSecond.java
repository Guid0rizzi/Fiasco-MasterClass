package Intermediate.Inheritance;

public class NinjaSecond {
    String nome;
    String aldeia;
    Integer idade;

    public void ApresentacaoNinja(String nome){
        System.out.println("O meu nome é "+ nome+" e eu sou um ninja");
    }
    public Integer IdadeParaSerHokage (int idadeMinimaParaSerHokage){
        return  idadeMinimaParaSerHokage - idade;
    }
}
