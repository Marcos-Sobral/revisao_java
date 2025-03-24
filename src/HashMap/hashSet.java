package HashMap;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(60);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(20);
        numeros.add(50);

        System.err.println(numeros);
        for (Integer i : numeros) {
            System.out.println(i);
        }
    }
}
