package Filas;
/*Conceito
A fila é dupla devido ela funcionar tanto com metodos pegando os primeiros da fila, como também os últimos */
import java.util.Deque;
import java.util.LinkedList;

/*Metodos de fila dupla:

    addFirst() / addLast() → Adiciona no início ou fim.

    pollFirst() / pollLast() → Remove do início ou fim.

    peekFirst() / peekLast() → Consulta o primeiro ou o último elemento.

 */
public class deque {
    public static void main(String[] args) {
        Deque<String> filaDupla = new LinkedList<>();

        filaDupla.addFirst("Primeiro"); // [Primeiro]
        filaDupla.addLast("Último");// [´Primeiro, último]
        filaDupla.addFirst("Novo Primeiro");

        System.out.println("Fila Dupla: "+ filaDupla); // [Novo Primeiro, Primeiro, último]

        System.out.println("Removendo do fim: " + filaDupla.pollLast());//[Novo Primeiro, Primeiro]
        System.out.println("Fila atualizada: " + filaDupla);
    }
}

/*
 ✅ Queue → Quando você precisa de uma fila normal, onde o primeiro elemento sempre sai primeiro (ex: fila de suporte).
✅ Deque → Quando precisa de mais flexibilidade, removendo e adicionando elementos de ambos os lados (ex: histórico de navegação).
 */
