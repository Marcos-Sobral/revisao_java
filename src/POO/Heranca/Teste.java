package POO.Heranca;

class Animal{
    public void fazerSom(){
        System.out.println("som do Animal");
    }
}

class Cachorro extends Animal{
    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }
}

class Gato extends Animal{
    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }
}


public class Teste {
    public static void main(String[] args) {
       Cachorro dog = new Cachorro();
       Gato cat = new Gato();

       cat.fazerSom();
       dog.fazerSom();
    }
}
