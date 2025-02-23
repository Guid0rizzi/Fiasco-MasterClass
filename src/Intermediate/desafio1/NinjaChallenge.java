package Intermediate.desafio1;

public class NinjaChallenge {
    Integer idade;
    String nome;
    String aldeia;
    String nomeMissao;
    String nivelDificuldade;
    String statusDaMissao;


    public NinjaChallenge(Integer idade, String nome, String aldeia, String nivelDificuldade, String nomeMissao, String statusDaMissao) {
        this.idade = idade;
        this.nome = nome;
        this.aldeia = aldeia;
        this.nomeMissao = nomeMissao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusDaMissao = statusDaMissao;
    }


    public String Missao(){
      return "tenho que fazer a missão "+ this.nomeMissao;
    }
    public String nivelDificuldade (){
        return "O nivel da dificulade da missão é " + this.nivelDificuldade;
    }
    public String statusDaMissao (){
        return "O status da missão é " + this.statusDaMissao;
    }

    public void mostrarInfos ( ){
        System.out.println("-------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Aldeia: " + this.aldeia);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println(Missao());
        System.out.println(nivelDificuldade());
        System.out.println(statusDaMissao());
        System.out.println("-------------------------------------");
    }
}
