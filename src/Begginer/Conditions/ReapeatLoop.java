package Begginer.Conditions;

public class ReapeatLoop {
    public static void main (String [] args){
/**
 * Laços de repetição são laços que vão se repetir infinitamente ou até chegar na condição verdadeira
 * while = for
 */
        //while
        int numeroClones = 0;
        int numeroMaximoClones = 70;
//        while(numeroClones <= numeroMaximoClones){
//            numeroClones ++;
//            System.out.println("Mais um clone do naruto "+ numeroClones);
//        }
        for (int i = 0; i<= numeroMaximoClones  ; i++) {
            System.out.println("Mais um clone do naruto, Clone: "+ i );
        }
    }
}
