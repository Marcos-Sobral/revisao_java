import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        System.out.println("Qual e a nota do aluno? ");
    
    Scanner entradaNota = new Scanner(System.in);
    int nota = entradaNota.nextInt(); 
    
    if (nota > 6){
      System.out.println("A média: " + nota + ", Aluno foi aprovado"); 

      Scanner entrada = new Scanner(System.in);
      boolean escolha = entrada.nextBoolean();
      
      if(escolha == true){
        System.out.println("Deseja continuar? ");
      }else{
        System.out.println("Obrigado por usar nosso sistema");
      }
    }
      else if(nota == 6 ){
        System.out.println("A média: " + nota + ", Aluno está de recuperação");
      }
        
    else{
      System.out.println("A média: " + nota + ", Aluno foi reprovado");
    }
   
    /*
   double base, altura, area;

    base = 8.00;
    altura = 3.00;

    area = (base * altura) / 2;

    System.out.println(area);
    */
    
    /*
    double numA, numB, total;
    
    numA = 8;
    numB = 3;
    total = numA + numB;
    
    System.out.println(total);
    
    */

    
    /*
    System.out.println("Informe seu nome: ");
      String palavra;
      
      Scanner entrada = new Scanner(System.in);
      palavra = entrada.next();
  
    System.out.println("Nome: " + palavra + ", contém: " + palavra.length() + " caracteres.");
    
    */
    }
}
