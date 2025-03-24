package POO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<PessoaEncapsulada2> pessoas = new ArrayList<>();

        pessoas.add(new PessoaEncapsulada2("Marcos", 24));
        pessoas.add(new PessoaEncapsulada2("Débora", 25));
        pessoas.add(new PessoaEncapsulada2("Lorran", 24));
        
        for (PessoaEncapsulada2 pessoa : pessoas) {
            pessoa.exibirDados();
        }

        /*Objeto encapsulado 
        PessoaEncapsulada pessoa = new PessoaEncapsulada();

        pessoa.setNome("Marcos");
        pessoa.setIdade(23);
        pessoa.setNome("Lorran");
        pessoa.setIdade(24);

        pessoa.apresentar();

*/
        /*Lista de objetos sem encapsulamento
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Marcos", 24));
        pessoas.add(new Pessoa("Débora", 25));
        pessoas.add(new Pessoa("Lorran", 24));

        for (Pessoa pessoa : pessoas) {
            pessoa.apresentar();
        }*/

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
