package Array;

import java.util.Scanner;

public class Array {
    public static void idades(){
        int[] idades = new int[5]; //criar um array de tamanho 5

        idades[0] = 20;
        idades[1] = 30;
        idades[2] = 40;
        idades[3] = 50;
        idades[4] = 60;

        for (int idade : idades) {
            System.out.println("- "+idade);
        }
    }


    public static void numeros(){
        int[] numeros = new int[5];
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++){
                System.out.println("Informe um número inteiro para a posição " + (i + 1) + ":");
            numeros[i] = entrada.nextInt();
        }
        
        //exibir em ordem normal
        System.out.println("Lista normal");
        for (int listaNumero : numeros) {
            System.out.println("- "+listaNumero);
        }

        //exibir em ordem inversa
        System.out.println("Lista inversa");
        for(int i = numeros.length - 1; i >=0 ;i--){
            System.out.println("- "+numeros[i]);
        }
    }

    public static void frutas(){
        String[] frutas = {"Banana", "Pera", "Uva", "Manga"}; // Array com 5 valores

        for(int i = 1; i < frutas.length; i++){
            System.out.println("- "+i+": "+frutas[i]);
        }
    }

    public static void main(String[] args) {

    }
}
