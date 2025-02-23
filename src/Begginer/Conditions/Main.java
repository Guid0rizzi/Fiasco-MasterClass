package Begginer.Conditions;

public class Main {
    public static void main(String [] args){
        /*
         *Ternarios: São maneiras de reduzir o codigo
         variavel  = (condicao)? valorSeVerdadeiro : valoSefalso
         */
        short numeroDeMissoes = 1;
        String nivel  = (numeroDeMissoes >= 11) ? "Este ninha fez mais de 10 missões": "Este ninja tem menos de 10 missoes";
        System.out.println(nivel);

    }
}
