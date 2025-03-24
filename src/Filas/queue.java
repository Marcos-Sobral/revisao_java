//Uma Queue (Fila) segue o princípio FIFO (First In, First Out), ou seja, o primeiro elemento a entrar é o primeiro a sair.
package Filas;

import java.util.LinkedList;
import java.util.Queue;
/*Metodos de uma fila
 
    add(): Adiciona um elemento (se a fila estiver cheia, lança exceção).

    offer(): Adiciona um elemento (se a fila estiver cheia, retorna false).

    poll(): Remove e retorna o primeiro elemento da fila (se estiver vazia, retorna null).

    peek(): Retorna o primeiro elemento sem remover (se estiver vazia, retorna null).
 */
public class queue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Marcos");
        fila.add("Débora");
        fila.add("Lorran");
        fila.add("Carlo");

        //fila.poll();//remove o primeiro item da fila
        System.out.println("Fila: " + fila);

        System.out.println("Atendendo: " + fila.poll()); // Remove Marcos
        System.out.println("Próximo a ser atendido: " + fila.peek()); // Mostra Débora

        System.out.println("Fila atualizada: " + fila);
    }
}
