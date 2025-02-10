public class Calculadora {

    public static int soma(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("O resultado da soma: "+soma(1,2));
        System.out.println("O resultado da subtração: "+subtrair(1,2));
        
        Calculadora_multiplicacao multiplicacao = new Calculadora_multiplicacao(2);
        
        int resultadoMultiplicacao = multiplicacao.multiplicar(5);
        System.out.println("O resultado da multiplicação foi: " + resultadoMultiplicacao);
    }
}
