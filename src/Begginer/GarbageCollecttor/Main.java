package Begginer.GarbageCollecttor;

public class Main {
    public static void main(String[] args) {
        String [] ninjas = new String[5];
        ninjas[0] = "Naruto Uzumake";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[3] = "Kakashi Hatake";
        ninjas[4] = "Hinata Hyuga";
        for(int i = 0  ; i < ninjas.length; i++ ){
            System.out.println(ninjas[i]);
        }

        System.out.println("-----------------------------------------------");
        ninjas = new String[7];
        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }
        ninjas [0] = "Hashirama";
        ninjas [1] = "Tobirama";
        ninjas [2] = "Hiruzen";
        ninjas [3] = "Minato";
        ninjas [4] = "Tsunade";
        ninjas [5] = "Kakashi";
        ninjas [6] = "Naruto";
        for (int i = 0; i < ninjas.length ; i++) {
            System.out.println(ninjas[i]);
        }
        /*
        Garbage collector é um coletor de lixo, como podemos ver,
        Quando abrimos um novo objeto com a mesma variavel (redeclaração)
        perdemos tdos os dados para não ocorrer um vazamento de dados
        * */
        
    }
}
