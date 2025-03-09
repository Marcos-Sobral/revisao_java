package Array;

public class Matrizes {
    public static void main(String[] args) {
        
    // Matrizes
    // O primeiro [] é para linhas e o segundo [] é para colunas
    // São 3 linhas e 5 colunas
    
    int[][] dados = new int[3][5];

    dados[0][0] = 1;
    dados[0][1] = 2;
    dados[0][2] = 3;
    dados[0][3] = 4;
    dados[0][4] = 5;

    dados[1][0] = 11;
    dados[1][1] = 21;
    dados[1][2] = 31;
    dados[1][3] = 41;
    dados[1][4] = 51;

    dados[2][0] = 12;
    dados[2][1] = 22;
    dados[2][2] = 32;
    dados[2][3] = 42;
    dados[2][4] = 52;
    
    
    for (int contC = 0; contC < 3; contC++){
      for (int contL = 0; contL < 5; contL++){
        System.out.println(" COLUNA " + contC + " | LINHA " + dados[contC][contL]);
      }
      System.out.println(" ");
    }
      
    
    /*
    Introdução a vetores
    
    int[] vetor = new int[5];

    vetor[0] = 1;
    vetor[3] = 9;
    vetor[4] = 15;

    System.out.println(vetor[0]);

    */
    }
}
