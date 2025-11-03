package Intermediate.Collections.LinkedHashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> ninjaArray = new ArrayList<>();//arrayList seria uma maneira de organizar antes de inserir ela no TreeSet
        ninjaArray.add("Naruto Uzumaki");
        ninjaArray.add("Sasuke Uchiha");
        ninjaArray.add("Sakura Hanuro");
        ninjaArray.add("Naruto Uzumaki");
        ninjaArray.add("Tsunade Senju");
        Set<String> ninjaHashSet = new LinkedHashSet<>();//ele tirou todas as duplicadas é deixou na ordem de implementação
        ninjaHashSet.addAll(ninjaArray);
        ninjaHashSet.remove("Sakura Hanuro"); //a unica maneira de tirar no TreeSet
        System.out.println(ninjaHashSet);
    }
}
