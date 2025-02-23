package Begginer.ScannerExemp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Fale o seu nome, Ninja ");
        String nome = sc.nextLine();
        System.out.println("Fale a sua idade, Ninja ");
        Integer idade = sc.nextInt();
        System.out.println("O nome do ninja é "+ nome);
        if (idade > 18){
            System.out.println("Voce pode fazer muitas missões, fora da Aldeia");
        }else{
            System.out.println("Ta criança de mais, só missões de A e B");
        }
        sc.close();
    }
}