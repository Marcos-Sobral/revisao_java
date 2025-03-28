package POO;

import java.util.ArrayList;

class Animal{
    public void fazerSom(){
        System.out.println("Som do animal");
    }

    public void movimentar(){
        System.out.println("Movimentando o animal");
    }
}

class Leao extends Animal{
    @Override
    public void fazerSom() {
        System.out.println("Rugidooo");
    }
    @Override
    public void movimentar() {
        System.out.println("Leão corre pela savana");
    }
}

class Elefante extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Pruuuu!"); // Som do elefante
    }

    @Override
    public void movimentar() {
        System.out.println("Elefante anda pesadamente.");
    }
}


class Cobra extends Animal{
    @Override
    public void fazerSom() {
        System.out.println("Sssss!");
    }

    @Override
    public void movimentar() {
        System.out.println("Cobra rasteja silenciosamente");
    }
}

public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Leao());
        animais.add(new Elefante());
        animais.add(new Cobra());

        for (Animal animal : animais) {
            animal.fazerSom();
        }
        
        for (Animal animal : animais) {
            animal.movimentar();
        }
    }
}
