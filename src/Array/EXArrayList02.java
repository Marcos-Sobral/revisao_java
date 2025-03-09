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
        
        System.out.println("Digite um número que você deseja Adicionar: ");
        int numeroAdicionar = entrada.nextInt();
        adicionarNumero(numeroAdicionar, numeros);
        
        System.out.println("Lista após adição: " + numeros);

        //Remover um número digitado pelo usário
        System.out.println("Digite um número que você deseja remover: ");
        int numeroRemover = entrada.nextInt();

        removerNumero(numeroRemover, numeros);

        // Exibir a lista após remoção
        System.out.println("Lista atualizada: " + numeros);
        
        entrada.close();
    }
}
