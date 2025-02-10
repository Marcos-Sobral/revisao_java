public class ExemploMetodoPessoa {
    // Atributo de instância
    private String nome;

    // Construtor para inicializar o nome
    public ExemploMetodoPessoa(String name){
        this.nome = name;
    }

    // Método de instância: Depende do objeto
    public void cumprimentar(){
        System.out.println("Olá, meu nome é " + nome + "!");
    }

    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        ExemploMetodoPessoa pessoa = new ExemploMetodoPessoa("Marcos");
        
        // Chamando o método de instância
        pessoa.cumprimentar();
    }
}
