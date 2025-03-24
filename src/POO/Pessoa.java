package POO;

public class Pessoa {
    String nome;
    int idade;

    /*Para evitar de criar várias objetos pessoas, usamos o metodo construtor*/
    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade= idade;
    }

    void apresentar(){
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
