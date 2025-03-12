package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
A ideia desse sistema é criar uma lista de presentes de casamento, assim é necessário que o sistema verifique quem é a pessoa e o seu presente;*/

class Convidados{
    String nomeConvidado;
    String presenteConvidado;
    String presencaConvidado;

    Convidados( String Convidado, String presente, String presenca){
        this.nomeConvidado = Convidado;
        this.presenteConvidado = presente;
        this.presencaConvidado = presenca;
    }

    public String exibirLista(){
        return "\nNome do Convidado: " + nomeConvidado +"\nPresente: "+ presenteConvidado + "\nPresença na festa: "+ presencaConvidado;
    }
    /*
    @Override
    public String toString(){
        return "Nome do Convidado: " + nomeConvidado +"\nPresente: "+ presenteConvidado + "\nPresença na festa: "+ presencaConvidado;
    }
    */
    /*
    public String exibirLista(){
        return "Nome do Convidado: " + nomeConvidado +"\nPresente: "+ presenteConvidado + "\nPresença na festa: "+ presencaConvidado;
    }

    public String toString(){
        return exibirLista();
    }*/
}

public class EXArrayList03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Convidados> convidados_list = criarLista();
        System.out.println("Seja bem vindo a Lista de convidados do casamento de Marcos e ébora");

        receberDados(entrada, convidados_list);

        for (Convidados i : convidados_list) {
            System.out.println(i.exibirLista());
        }
    }

    //Método de Fábrica (Factory Method)
    /*
    Um método de fábrica (criarListaDeConvidados()) cria e retorna a lista de convidados. Isso ajuda a manter o código organizado e facilita a reutilização.
     */
    public static List<Convidados> criarLista() {
        List<Convidados> lista = new ArrayList<>(Arrays.asList(
            new Convidados("Irailde Sobral", "Geladeira", "SIM"),
            new Convidados("Karol Sobral", "Casa no Jardim Aulídia", "SIM"),
            new Convidados("Eranildo Sobral", "Armário", "SIM"),
            new Convidados("Filomena Sobral", "Fogão", "SIM"),
            new Convidados("Reginaldo", "Microondas", "SIM"),
            new Convidados("Ivanilde Sobral", "Guarda Roupa", "SIM"),
            new Convidados("Ivanilde Sobral", "Cama Box King", "SIM"),
            new Convidados("Cláudio e Valdirene", "Máquina de lavar", "SIM")
        ));

        return lista;
    }

    public static void receberDados(Scanner entrada, List<Convidados> listaConvidados) {
        System.out.println("\nInforme seu nome:");
        String nomeConvidado = entrada.nextLine();

        System.out.println("\nInforme o presente:");
        String presenteConvidado = entrada.nextLine();

        System.out.println("\nConfirme sua presença para o chá de panela: SIM/NÃO");
        String presencaConvidado = entrada.nextLine();
        
        //convidados.add(new Convidados(null, null, false));
        listaConvidados.add(new Convidados(nomeConvidado, presenteConvidado, presencaConvidado));
    }
}
