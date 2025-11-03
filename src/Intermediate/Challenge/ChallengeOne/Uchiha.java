package Intermediate.Challenge.ChallengeOne;

public class Uchiha extends Ninja{
    String habilidadeSpecial;
    public Uchiha(Integer idade, String nome, String aldeia, String nivelDificuldade, String nomeMissao, String statusDaMissao, String habilidadeSpecial) {
        super(idade, nome, aldeia, nivelDificuldade, nomeMissao, statusDaMissao);
        this.habilidadeSpecial = habilidadeSpecial;
    }

    public String getHabilidadeSpecial() {
        return habilidadeSpecial;
    }

    public void setHabilidadeSpecial(String habilidadeSpecial) {
        this.habilidadeSpecial = habilidadeSpecial;
    }

    public String HabilidadeEspecial(){
        return "Habilidade especial: "+ this.habilidadeSpecial;
    }
    public void mostrarInfosUchiha ( ){
        System.out.println("-------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println(HabilidadeEspecial());
        System.out.println("Aldeia: " + this.aldeia);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println(Missao());
        System.out.println(nivelDificuldade());
        System.out.println("-------------------------------------");
    }
}
