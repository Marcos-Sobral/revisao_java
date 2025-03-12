package HashMap;

import java.util.HashMap;

public class exemplo01 {
    public static void main(String[] args) {
        HashMap<String, Integer> idades = new HashMap<>();

        idades.put("Marcos", 23);
        idades.put("Débora", 25);
        idades.put("Lorran", 24);
        idades.put("Carlo", 24);
        idades.put("Guilherme", 24);

        System.out.println("\nIdade: "+ idades.get("Marcos"));

        System.out.println("\nLista de amigos: \n");
        for (String nome : idades.keySet()) {
            System.out.println(nome + " tem " + idades.get(nome) + " anos.");
            /*
            idades.keySet() = Retorna todas as chaves (nomes).
            nome == indice{i} ou idades[2] get.(nome) == o dado do indice
            nome é a coluna(indice) e idades.get(nome) é as linhas (conteudo)*/
        }
        
        //removendo
        idades.remove("Carlo");
        System.out.println(idades);

        System.out.println("\nVerificando se existe os dados Marcos e 24: \n");
        if(idades.containsKey("Marcos")){
            System.out.println("Marcos está na lista\n");
        }
        if(idades.containsValue(24)){
            System.out.println("Existe pessoa(s) com essa idade\n");
        }

        System.out.println("Verificando idade: \n");
        for (String nome : idades.keySet()) {
            if (idades.get(nome) == 24) {
                System.out.println(nome + " tem " + idades.get(nome) + " anos.");
            }
        }
    }
}
