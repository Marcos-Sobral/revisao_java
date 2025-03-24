package POO;

public class PessoaEncapsulada {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome= nome;
    }

    public String getNome(){
        return nome;
    }

   
    public void setIdade(int idade){
        if(idade >= 0){
            this.idade = idade;
        }else{
            System.out.println("Idade inválida! Definindo como 0.");
            this.idade = 0;
        }
    }

    // Método para obter a idade
    public int getIdade(){
        return idade;
    }

    //Construtor Utilizando Métodos Setters no Construtor
    PessoaEncapsulada(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    public void exibirDados() {
        System.out.println(nome + " tem " + idade + " anos.");
    }
}

/*Vantagas e desvantagens
    ✅ Vantagens:
    ✔ Encapsulamento: Se houver mudanças na lógica de validação, basta alterar os métodos setNome() ou setIdade(), sem modificar o construtor.
    ✔ Reutilização de código: A validação da idade já está no setIdade(), então qualquer outra parte do código que chame setIdade() terá a mesma validação.
    ✔ Mais flexível: Permite que atributos sejam alterados após a criação do objeto sem precisar duplicar a validação.

    ❌ Desvantagem:

    Desempenho ligeiramente menor, pois há chamadas extras de métodos dentro do construtor.
 */
