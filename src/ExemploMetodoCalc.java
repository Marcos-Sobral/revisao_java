public class ExemploMetodoCalc {
    public static double somar(double valor1, double valor2){
        return valor1 + valor2;
    }
    public static double sub(double valor1, double valor2){
        return valor1 - valor2;
    }
    public static double divicao(double valor1, double valor2){
        return valor1 / valor2;
    }
    public static double multiplicacao(double valor1, double valor2){
        return valor1 * valor2;
    }
    public static double calcularAreaCirculo(double raio){
        return 3.14159 * raio * raio;
    }

    public static void main(String[] args) {
        int entrada = 5; 
        System.out.println("1 - SOMAR");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - DIVIÇÃO");
        System.out.println("4 - MULTIPLICAÇÃO");
        System.out.println("5 - CALCULAR AREA DO CIRCULO");
        switch (entrada) {
            case 1:
                double resultadoSomar = somar(2, 2);
                System.out.println("O resultado da soma foi: "+ resultadoSomar);
                break;
            case 2:
                double resultadoSub = sub(2, 2);
                System.out.println("O resultado da subtração foi: "+ resultadoSub);
                break;
            case 3:
                double resultadoDiv = divicao(2, 2);
                System.out.println("O resultado da divição foi: "+ resultadoDiv);
                break;
            case 4:
                double resultadoMult = multiplicacao(2, 2);
                System.out.println("O resultado da divição foi: "+ resultadoMult);
                break;
            case 5:
                double resultadoArea = calcularAreaCirculo(2);
                System.out.println("O resultado da soma foi: "+ resultadoArea);
                break;
        
            default:
                System.out.println("Operaçãoo invalida!");
                break;
        }
    }
}
