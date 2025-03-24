package Filas;

import java.util.LinkedList;
import java.util.Queue;

public class queue02 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Adicionando elementos na fila
        fila.add("Ana");
        fila.offer("Carlos");
        fila.add("Beatriz");

        System.out.println("Fila: " + fila); // [Ana, Carlos, Beatriz]

        // Consultando o primeiro da fila sem remover
        System.out.println("Primeiro (peek): " + fila.peek()); // Ana
        System.out.println("Primeiro (element): " + fila.element()); // Ana

        // Removendo elementos
        System.out.println("Removido (poll): " + fila.poll()); // Ana
        System.out.println("Fila agora: " + fila); // [Carlos, Beatriz]

        System.out.println("Removido (remove): " + fila.remove()); // Carlos
        System.out.println("Fila agora: " + fila); // [Beatriz]
    }
}
