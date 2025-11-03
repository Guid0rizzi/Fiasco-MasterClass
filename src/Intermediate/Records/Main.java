package Intermediate.Records;

public class Main {
    public static void main(String[] args) {
        Ninja ninjaClass = new Ninja("Naruto", "naruto@gmail.com",111111);
        NinjaRecord ninjaRecord = new NinjaRecord("Sasuke", "sasuke@gmail.com", 111111);
        System.out.println("ninja class: "+ninjaClass);
        System.out.println("ninja record: "+ninjaRecord);
        //usando records
        System.out.println(ninjaRecord.name()); //acessar o nome, equivalente ao getNome
        //os records são usados igual aos enum quando vc sabe que a sua classe não vai alterada (
        //Um tipo especial de classe que armazena dados imutáveis)
        // (records cria tudo: equals(), hashCode(), e toString())

        /*
            Garante que os objetos sejam imutáveis e simplifica a criação de classes que apenas carregam dados
         */
    }
}
