package Begginer.SwitchCaseExamp;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner( System.in);
        System.out.println("Escolha um personagem");
        System.out.println("1- Naruto");
        System.out.println("2- Sasuke");
        System.out.println("3- Sakura");
        Integer escolha = sc.nextInt();
        switch (escolha){
            case 1:
                System.out.println("O user escolheu o Naruto");
                break;
            case 2:
                System.out.println("O user esclheu o Sasuke");
                break;
            case 3:
                System.out.println("O user escolheu a Sakura");
            break;
            default:
                System.out.println("Essa resposta não e valida :|");
        }
        sc.close();
    }
}
