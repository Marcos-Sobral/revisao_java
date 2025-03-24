package HashMap;

import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(40);
        numeros.add(10);
        numeros.add(50);
        numeros.add(30);
        numeros.add(20);
        numeros.add(50);

        for (Integer i : numeros) {
            System.out.println(i);
        }
    }
}
