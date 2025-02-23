package Begginer.Desafio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean getStart = true;
        int MAX_NINJAS = 7;
        String [] ninjas = new String[MAX_NINJAS];
        int ninjasCadastrados = 0;
        while (getStart) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Coloque o nome do ninja para cadastro");
                    String nomeNinja = sc.next();
                    if (ninjasCadastrados < MAX_NINJAS){
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso");
                    } else{
                        System.out.println("O numero de ninjas esta cheia");
                    }
                    break;
                case 2:
                    System.out.println("Aqui estão os seus ninjas cadastrados");
                    for (int i = 0; i < ninjas.length ; i++) {
                        System.out.println(ninjas[i]);
                    }
                    break;
                case 3:
                    getStart = false;
                    break;
                default:
            }
        }
        sc.close();
    }
}
/*
String[] ninjas = new String[7]; // Array vazio (todos os elementos são null)
int ninjasCadastrados = 0;

ninjas[ninjasCadastrados] = "Naruto"; // ninjas[0] = "Naruto"
ninjasCadastrados++; // Agora ninjasCadastrados vale 1

ninjas[ninjasCadastrados] = "Sasuke"; // ninjas[1] = "Sasuke"
ninjasCadastrados++; // Agora ninjasCadastrados vale 2

ninjas[ninjasCadastrados] = "Sakura"; // ninjas[2] = "Sakura"
ninjasCadastrados++; // Agora ninjasCadastrados vale 3
 */
