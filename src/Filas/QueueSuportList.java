package Filas;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSuportList {
    public static void main(String[] args) {
        Queue<String> listaSuporte = new LinkedList<>();
        listaSuporte.add("Marcos");
        listaSuporte.add("Débora");
        listaSuporte.add("Carlo");
        listaSuporte.add("Guilherme");
        listaSuporte.add("Jorge Lucas");
        listaSuporte.add("Elian");
        
        System.out.println("Lista de clientes 24/03/2025");
        for (String clientes : listaSuporte) {
            System.out.println("- "+clientes);
        }
        System.out.println("");
        System.out.println("O primeiro cliente do dia foi: "+ listaSuporte.poll());
        System.out.println("Logo em seguida foi: "+ listaSuporte.peek());
        listaSuporte.poll();

        System.out.println("");
        System.out.println("Infelizmente, o cliente não veio: "+ listaSuporte.poll());
    }
}
