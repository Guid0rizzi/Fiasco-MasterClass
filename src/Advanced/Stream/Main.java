package Advanced.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import static java.util.Locale.filter;

public class Main {
    public static <T> Optional<T> filter(List<T> list, Predicate<T> predicate){
        return list.stream().filter(predicate).findFirst();
    }
    /*
    * public static: método estático, pode ser chamado sem criar objeto.
    * <T>: T é um tipo genérico.
    * Significa que este método funciona para qualquer tipo (Person, Car, String, etc.).
    * Optional<T>: o método retorna um Optional que pode ou não conter um valor do tipo T.
    * List<T> list: você recebe uma lista de elementos do tipo T.
    * Predicate<T> predicate: recebe uma função que recebe um T e retorna boolean, usada para filtrar.
    */

    /*
    * list.stream()
    * Converte a lista em um Stream, que permite operações funcionais (filter, map, etc.).
    *
    * .filter(predicate)
    * Aplica o predicate (a condição) a cada elemento.
    * Apenas os elementos que retornarem true permanecem no stream.
    *
    * .findFirst()
    * Retorna o primeiro elemento filtrado, encapsulado em Optional<T>.
    * Se nenhum elemento passar no filtro → retorna Optional.empty().*/
    public static void main(String[] args){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Leonardo Moreira Guidorizzi", 20, "Osasco"));
        people.add(new Person("Ayrton Senna", 30, "São Paulo"));
        people.add(new Person("Rita Lee", 50, "São Paulo"));
        people.add(new Person("Sergio Melo", 45, "Rio de Janeiro"));
        people.add(new Person("Wagner Moura", 49, "Salvador"));


        System.out.println("----------------- Filtro por Nome ----------------");

        people.stream()
                .filter(person -> person.getCity().equals("Osasco"))
                .forEach(System.out::println);

        System.out.println("----------------- Ondenação por idade ----------------");
        people.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getAge(), n2.getAge()))
                .forEach(System.out::println);


        System.out.println("-------------- Filtro interno por Nome ----------------");
        Optional<Person> peopleFromOsasco = filter(people, person -> "Osasco".equals(person.getCity()));
        System.out.println(peopleFromOsasco);

        System.out.println("-------------- Ordenação por Nome  ----------------");
        people.stream().sorted((n1 , n2 ) -> n1.getName().compareTo(n2.getName())).forEach(System.out::println);

        System.out.println("-------------- Pessoa mais velha  ----------------");
        Person elderOne = people.stream()
                .max((n1 , n2 ) -> Integer.compare(n1.getAge(), n2.getAge()))
                .orElse(null);

        System.out.println(elderOne);

    }
}
