package POO;

public class PessoaEncapsulada2 {
    private String nome;
    private int idade;


    //Atribuição direta no Construtor
    public PessoaEncapsulada2(String nome, int idade){
        this.nome = nome;
        if(idade >= 0){
            this.idade = idade;
        }else{
            System.out.println("Idade inválida! Definindo como 0.");
            this.idade = 0;
        }
    }

    public void exibirDados() {
        System.out.println(nome + " tem " + idade + " anos.");
    }
}

/*Vantagas e desvantagens
    ✅ Vantagens:
    ✔ Código mais curto e direto.
    ✔ Inicializa os atributos rapidamente sem precisar de métodos extras.
    ✔ Melhor desempenho, pois não há chamadas desnecessárias a setIdade() e setNome().

    ❌ Desvantagem:

    Não reutiliza a lógica de validação que poderia estar no setIdade().

    Se for necessário mudar a regra de validação no futuro, será necessário modificar o construtor diretamente.
 */