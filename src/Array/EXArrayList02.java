package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class EXArrayList02 {

    public static void adicionarNumero(int numero, ArrayList<Integer> numerosArray){
        numerosArray.add(numero);
    }

    public static void removerNumero(int numero, ArrayList<Integer> numerosArray){
        if (numerosArray.contains(numero)) {
            numerosArray.remove(Integer.valueOf(numero));
            System.out.println("Número " + numero + " removido!");
        }else{
            System.out.println("Número não encontrado.");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        
        System.out.println("Digite os números que você deseja adicionar (separados por espaço): ");
        String numeroAdicionar = entrada.nextLine();
        for (String num: numeroAdicionar.split(" ")) {
            adicionarNumero(Integer.parseInt(num), numeros);
        }
        
        System.out.println("Lista após adição: " + numeros);

        //Remover um número digitado pelo usário
        System.out.println("Digite os números que você deseja remover (separados por espaço): ");
        String numeroRemover = entrada.nextLine();
        for (String num : numeroRemover.split(" ")) {
            removerNumero(Integer.parseInt(num), numeros);
        }

        // Exibir a lista após remoção
        System.out.println("Lista atualizada: " + numeros);
        
        entrada.close();
    }
}
