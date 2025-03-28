package POO.Heranca;


//Os atributos e metodos do pai vão ser herdados para os filhos
class Pai {
    private String sobrenome = "Sobral Lima";
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    public void falar(){
        System.out.println("Eu sou o pai!");
    }
}

//A classe filho vai ser sempre a que herda as coisas, no presente caso o filho herda sobrenome do pai
class Filho extends Pai{
    String nome = "Marcos Vinicius ";

    /*void apresentar(){
        System.out.println(nome+sobrenome); //é possivel acessar tudo da classe pai sem criar um objeto
    }*/

    /*@Override //sobrescreve o metodo completo
    public void falar() {
        System.out.println("Eu sou o filho");
    }*/
    
    @Override
    public void falar() {
        
        super.falar(); //super = Salvar como, permance as mesmas coisas e posibilita adicionar coisas
        System.out.println("Eu sou o filhos.");
    }

}