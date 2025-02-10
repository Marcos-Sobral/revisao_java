import java.util.Scanner;

public class ExemploMetodoCalc_input {

    public static double somar(double valor1, double valor2){
        return valor1 + valor2;
    }
    public static double subtrair(double valor1, double valor2){
        return valor1 - valor2;
    }
    public static double dividir(double valor1, double valor2){
        if (valor2 == 0) {
            System.out.println("Erro: Divisão por zero não é permitida!");
            return 0;
        }
        return valor1 / valor2;
    }
    public static double multiplicar(double valor1, double valor2){
        return valor1 * valor2;
    }
    public static double calcularAreaCirculo(double raio){
        return 3.14159 * raio * raio;
    }

    public static void main(String[] args) {
        
        System.out.println("1 - SOMAR");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - DIVIÇÃO");
        System.out.println("4 - MULTIPLICAÇÃO");
        System.out.println("5 - CALCULAR AREA DO CIRCULO");

        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();
        
        double valor1 = 0, valor2 = 0, resultado;
        if(opcao >= 1 && opcao <= 4){
            System.out.println("Informe o primeiro valor:");
            valor1 = entrada.nextDouble();
            System.out.println("Informe o segundo valor:");
            valor2 = entrada.nextDouble();
        }else if(opcao == 5){
            System.out.println("Informe o valor do raio:");
            valor1 = entrada.nextDouble();
        }
        
        switch (opcao) {
            case 1:
                resultado = somar(valor1, valor2);
                System.out.println("O resultado da soma foi: "+ resultado);
                break;
            case 2:
                resultado = subtrair(valor1, valor2);
                System.out.println("O resultado da subtração foi: "+ resultado);
                break;
            case 3:
                resultado = dividir(valor1, valor2);
                System.out.println("O resultado da divição foi: "+ resultado);
                break;
            case 4:
                resultado = multiplicar(valor1, valor2);
                System.out.println("O resultado da divição foi: "+ resultado);
                break;
            case 5:
                resultado = calcularAreaCirculo(valor1);
                System.out.println("O resultado da soma foi: "+ resultado);
                break;
        
            default:
                System.out.println("Operação invalida!");
                break;
        }
    }
}
