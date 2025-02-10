public class ExemploMetodo {
    // Método estático - Não depende de nenhum objeto para ser chamado, apenas apresenta a mensagem
    public static void saudacao(){
        System.out.println("Olá, bem-vindo ao Java");
    }

    // Método de instância - Depende de um objeto para ser chamado
    public void mensagemInstancia(){
        System.out.println("Este é um método de instância!");
    }

    public static void MaiorIdade(int anoNascimento){
        int idade = 2025 - anoNascimento;
        if ( idade >= 18) {
            System.out.println("Você é de maior! pois tem "+ idade+" de idade");
        }else if(idade <= 16){
            System.out.println("Você não é de maior, mas pode votar nas eleições pois tem "+ idade+" de idade");
        }else{
            System.out.println("Você é uma criança e pronto.");
        }
    }

    public static void main(String[] args) {
        saudacao();
        System.out.println("Por favor, informe seu ano de nascimento");
        //MaiorIdade(2008);


    }
}
