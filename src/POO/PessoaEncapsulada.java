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

    // Método para definir a idade com validação
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

    PessoaEncapsulada(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    void apresentar(){
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
