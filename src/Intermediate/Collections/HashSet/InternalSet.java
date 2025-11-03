package Intermediate.Collections.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class InternalSet {
    public static void main(String[] args) {
        ArrayList<String> ninjaArray = new ArrayList<>();//arrayList seria uma maneira de organizar antes de inserir ela no TreeSet
        ninjaArray.add("Naruto Uzumaki");
        ninjaArray.add("Sasuke Uchiha");
        ninjaArray.add("Sakura Hanuro");
        ninjaArray.add("Naruto Uzumaki");
        Set<String> ninjaHashSet = new HashSet<>();//Treeset ele tirou todas as duplicadas mas colocou em order aleatoria
        ninjaHashSet.addAll(ninjaArray);
        ninjaHashSet.remove("Sakura Hanuro"); //a unica maneira de tirar no TreeSet
        System.out.println(ninjaHashSet);
    }
}
