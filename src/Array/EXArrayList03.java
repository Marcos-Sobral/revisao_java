package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
A ideia desse sistema é criar uma lista de presentes de casamento, assim é necessário que o sistema verifique quem é a pessoa e o seu presente;*/

class Convidados{
    String nomeConvidado;
    String presenteConvidado;
    boolean presencaConvidado;

    Convidados( String Convidado, String presente, boolean presenca){
        this.nomeConvidado = Convidado;
        this.presenteConvidado = presente;
        this.presencaConvidado = presenca;
    }

    public String exibirLista(){
        return "Nome do Convidado: " + nomeConvidado +"\nPresente: "+ presenteConvidado + "\nPresença na festa: "+ presencaConvidado;
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
        List<Convidados> convidados_list =  new ArrayList<>();

        //convidados.add(new Convidados(null, null, false));
        convidados_list.add(new Convidados("Irailde", "Geladeira", true));

        for (Convidados i : convidados_list) {
            System.out.println(i.exibirLista());
        }
    }
}
