package Intermediate.Collections.TreeSet;

import java.util.ArrayList;
import java.util.Set;

public class TreeSet {  public static void main(String[] args) {
    ArrayList<String> ninjaArray = new ArrayList<>();//arrayList seria uma maneira de organizar antes de inserir ela no TreeSet
    ninjaArray.add("Naruto Uzumaki");
    ninjaArray.add("Sasuke Uchiha");
    ninjaArray.add("Sakura Hanuro");
    ninjaArray.add("Naruto Uzumaki");
    Set<String> ninjaHashSet = new java.util.TreeSet<>();//Treeset ele tirou todas as duplicadas e vai deixar em order alfabetica
    ninjaHashSet.addAll(ninjaArray);
    ninjaHashSet.remove("Sakura Hanuro"); //a unica maneira de tirar no TreeSet
    System.out.println(ninjaHashSet);
}
}
