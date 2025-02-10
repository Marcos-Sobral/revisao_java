public class Calculadora_multiplicacao {
    private int fator;

    public Calculadora_multiplicacao(int fator){
        this.fator = fator;
    }

    public int multiplicar(int valor){
        return fator * valor;
    }
}
