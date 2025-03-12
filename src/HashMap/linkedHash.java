package HashMap;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedHash {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(20);
        numeros.add(50);
        System.out.println(numeros);
        for (Integer i : numeros) {
            System.out.println(i);
        }

        /*
         * O LinkedHashSet mantém a ordem de inserção dos elementos, enquanto o HashSet não garante nenhuma ordem específica.
         */
    }
}
