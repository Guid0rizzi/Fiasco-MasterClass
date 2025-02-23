package Begginer.Desafio1;



public class Main {
    public static void main(String[] args) {

        //ninja 1
        String nomeNinja1 = "Naruto";
        int idade1 = 10;
        String missao1 = "limpar as estutuas do hokage";
        String statusMissao1 = "Em andamento";
        char nivelMissao1 = 'A';
        //////////////////////////////////////////////////////
        if (idade1 < 15) {
            if (nivelMissao1 == 'C' || nivelMissao1 == 'B') {
                statusMissao1 = "concluido";
                System.out.println(statusMissao1);
            } else {
                statusMissao1 = "a começar idade insuficiente";
                System.out.println(statusMissao1);
            }
        } else {
            statusMissao1 = "em andamento";
            System.out.println(statusMissao1);
        }
        System.out.println("Nome do ninja:" + nomeNinja1);
        System.out.println("idade do ninja:" + idade1);
        System.out.println("Missão:" + missao1);
        System.out.println("Nivel da missão:" + nivelMissao1);
        System.out.println("status da missão:" + statusMissao1);
        System.out.println("-------------------------------------");
        ///////////////////////////////////////////////////////
        //ninja 2
        String nomeNinja2 = "Sasuke";
        int idade2 = 16;
        String missao2 = "fazer o exame e tirar 10";
        String statusMissao2 = "concluido";
        char nivelMissao2 = 'B';

        if (idade2 < 15) {
            if (nivelMissao2 == 'C' || nivelMissao2 == 'B') {
                statusMissao2 = "concluido";
            } else {
                statusMissao2 = "a começar idade insufiente";
            }
        } else {
            statusMissao2 = "em andamento";
        }
        System.out.println("Nome do ninja:" + nomeNinja2);
        System.out.println("idade do ninja:" + idade2);
        System.out.println("Missão:" + missao2);
        System.out.println("Nivel da missão:" + nivelMissao2);
        System.out.println("status da missão:" + statusMissao2);
        System.out.println("-------------------------------------");
        ///////////////////////////////////////////////////////////////

        //ninja 3
        String nomeNinja3 = "Sakura";
        int idade3 = 16;
        String missao3 = "fazer bosta nenhuma";
        String statusMissao3 = "a começar";
        char nivelMissao3 = 'C';
        if (idade3 < 15) {
            if (nivelMissao3 == 'C' || nivelMissao3 == 'B') {
                statusMissao3 = "concluido";
            } else {
                statusMissao3 = "a começar idade insufiente";
            }
        } else {
            statusMissao3 = "em andamento";
        }
        System.out.println("Nome do ninja:" + nomeNinja3);
        System.out.println("idade do ninja:" + idade3);
        System.out.println("Missão:" + missao3);
        System.out.println("Nivel da missão:" + nivelMissao3);
        System.out.println("status da missão:" + statusMissao3);
        System.out.println("-------------------------------------");

    }
}
