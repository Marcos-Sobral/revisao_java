package Filas;

import java.util.Stack;

public class PilhasSearch {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.push("D");

        System.out.println("Pilha atual: "+ pilha);

         // Buscando elementos
         System.out.println("Posição de 'C': " + pilha.search("C")); // Deve retornar 2
         System.out.println("Posição de 'A': " + pilha.search("A")); // Deve retornar 4
         System.out.println("Posição de 'X': " + pilha.search("X")); // Deve retornar -1 (não existe)
    }
}
