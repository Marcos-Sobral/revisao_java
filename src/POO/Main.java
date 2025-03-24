package POO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Marcos", 24));
        pessoas.add(new Pessoa("Débora", 25));
        pessoas.add(new Pessoa("Lorran", 24));

        for (Pessoa pessoa : pessoas) {
            pessoa.apresentar();
        }
        /*Modo simples sem construtor
        Pessoa p1 = new Pessoa();
        p1.nome = "Marcos";
        p1.idade= 24;
        
        p1.apresentar();

        Pessoa p2 = new Pessoa();
        p2.nome = "Débora";
        p2.idade= 25;

        p2.apresentar();

        */
    }
}
