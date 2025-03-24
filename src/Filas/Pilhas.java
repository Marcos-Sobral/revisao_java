package Filas;

import java.util.Stack;

public class Pilhas {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>(); 
        
        pilha.push("Livro 1");
        pilha.push("Livro 2");
        pilha.push("Livro 3");
        pilha.push("Livro 4");
        pilha.push("Livro 5");
        pilha.push("Livro 6");

        System.out.println("Pilha atual: " + pilha);

        // Pegando o topo sem remover (peek)
        System.out.println("Topo da pilha: " + pilha.peek()); //Livro 6

        // Removendo elementos (pop)
        System.out.println("Removendo: " + pilha.pop());
        System.out.println("Pesquisando livro 5: " + pilha.search("Livro 5"));
        System.out.println("Pilha após remoção: " + pilha);
        // Verificando se a pilha está vazia
        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }
}
