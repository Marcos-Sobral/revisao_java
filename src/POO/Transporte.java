package POO;

import java.util.ArrayList;

interface Veiculo {
    void acelerar();
    void frear();
}

class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }
    
    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }
}

class Moto implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando.");
    }
}

class Caminhao implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("O caminhão está acelerando.");
    }
    
    @Override
    public void frear() {
        System.out.println("O caminhão está freando.");
    }
}

public class Transporte {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Moto());
        veiculos.add(new Caminhao());

        for (Veiculo veiculo : veiculos) {
            veiculo.acelerar();
            veiculo.frear();
            System.out.println("---------");
        }
    }
}
