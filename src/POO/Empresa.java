package POO;

import java.util.ArrayList;

class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public double calcularSalario(){
        return 1000;
    }

    public String getNome() {
        return nome;
    }
}

class Gerente extends Funcionario{
    public Gerente(String nome){
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return 5000;
    }
}

class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome){
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return 3000;
    }
}

class Vendedor extends Funcionario{
    public Vendedor(String nome){
        super(nome);
    }
    
    @Override
    public double calcularSalario() {
        return 1500;
    }
}

class Estagiário extends Funcionario{
    public Estagiário(String nome){
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return 700;
    }
}

public class Empresa {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Gerente"));
        funcionarios.add(new Desenvolvedor("Dev"));
        funcionarios.add(new Vendedor("Vendedor"));
        funcionarios.add(new Estagiário("Estagiário"));

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + " recebe R$" + funcionario.calcularSalario());
        }
    }
}
