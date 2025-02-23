package Begginer.Arrays;

public class Array {
    public static void main (String [] args){

        //Array são tipos referencia! ele consome menos memoria do que o criar 300 variavais
        //O array cria uma unica referencia na minha memoria que vai ser compartilhamentalizada em pequenos slots da minha memoria onde
        // vão ser alocadas as minhas variaveis (Array não são flexiveis, list são flexiveis)
        String [] ninjas = new String[5];
        ninjas[0] = "Naruto Uzumake";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[3] = "Kakashi Hatake";
        ninjas[4] = "Hinata Hyuga";
        for(int i = 0  ; i < ninjas.length; i++ ){
            System.out.println(ninjas[i]);
        }
        System.out.println(ninjas); //--> isso ira "mostrar" aonde o array esta alocado na sua memoria (ele não consegue mostrar o local que ele
        // esta alocado) (esta mostrando a refencia!! na memoria)
        Boolean [] booleans = new Boolean[1];
        System.out.println(booleans[0]); //-> inicializam como false
        Double [] doubles = new Double[1];
        System.out.println(doubles[0]); //-> inicializam como 0.0
        Integer [] ints = new Integer[1];
        System.out.println(ints[0]);//-> Inicializam como 0
    }
}
