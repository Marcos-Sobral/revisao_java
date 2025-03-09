package Array;

import java.util.ArrayList;

public class ExArrayList {
    public static void main(String[] args) {
        ArrayList<String> trapers = new ArrayList<>();
        
        // Adicionando elementos
        trapers.add("Wiu");
        trapers.add("Oruam");
        trapers.add("Matue");
        trapers.add("Teto");
        trapers.add("Brandao085");
        trapers.add("Alee");
        trapers.add("Travis Scort");
        trapers.add("Zé Felipe");
        
        for (int i = 0; i < trapers.size(); i++) {
            if (trapers.get(i).equals("Oruam") || trapers.get(i).equals("Zé Felipe")) {
                trapers.remove(trapers.get(i));
            } else {
                System.out.println("- " + trapers.get(i));
            }
        }
    }
}
