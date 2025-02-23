package Intermediate.desafio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean getStartIt = true;
        NinjaChallenge ninja = null;
        int MAX_NINJAS = 10;
        String [] ninjas = new String[MAX_NINJAS];
        Integer ninjasCadastrados = 0;
        String serUchiha;

        while (getStartIt) {
            System.out.println("Criar um ninja pressione o 1");
            System.out.println("Ver as infos do seu ninja pressione o 2");
            System.out.println("Mostrar todos os seus ninjas pressione o 3");
            System.out.println("Sair do programa pressione o 0");
            int numeroEscolha = sc.nextInt();
            switch (numeroEscolha) {
                case 1:
                    System.out.println("Crie um ninja");
                    System.out.println("Coloque o nome ");
                    String nome = sc.next();
                    System.out.println("Nome da aldeia");
                    String aldeia = sc.next();
                    System.out.println("Idade do ninja");
                    Integer idade = sc.nextInt();
                    System.out.println("Missão");
                    String missao = sc.next();
                    sc.nextLine();
                    System.out.println("Nivel da missão");
                    String nivelDaMissao = sc.next();
                    System.out.println("Status da missão");
                    String statusDaMissao = sc.next();
                    System.out.println("Esse ninja vai ser um Uchiha?");
                    serUchiha = sc.next();
                    if (serUchiha.equalsIgnoreCase("S")){
                        System.out.println("Habilidade especial");
                        String habilidadeSpecial = sc.next();
                        ninja = new UchihaChallenge(idade, nome, aldeia, nivelDaMissao, missao, statusDaMissao, habilidadeSpecial );
                    }else{
                        ninja = new NinjaChallenge(idade, nome, aldeia, nivelDaMissao, missao, statusDaMissao);
                    }
                    if (ninjasCadastrados < MAX_NINJAS){
                        ninjas[ninjasCadastrados] = nome;
                        ninjasCadastrados++;
                    }
                    System.out.println("Ninja criado! To certo ");
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    if (ninja instanceof UchihaChallenge){
                        ((UchihaChallenge)ninja).mostrarInfosUchiha();
                        System.out.println("Deseja alterar a habilidade Especial do seu Uchiha?");
                        String escolha = sc.next();
                        if (escolha.equalsIgnoreCase("S")){
                            System.out.println("Qual sera a nova habilidade especial?");
                            String habilidadeEspecial = sc.next();
                            ((UchihaChallenge)ninja).setHabilidadeSpecial(habilidadeEspecial);
                            System.out.println("Ninja atualizado! To certo ");
                            System.out.println("-------------------------------------");
                        }
                    }else{
                        ninja.mostrarInfos();

                    }
                    break;
                case 3:
                    for (int i = 0; i < ninjas.length ; i++) {
                        System.out.println(ninjas[i]);
                    }
                    break;
                case 0:
                    System.out.println("saindo do programa...");
                    getStartIt = false;
                    break;
                default:
                    System.out.println("Coloque um numero valido");
            }


        }

    }
}
