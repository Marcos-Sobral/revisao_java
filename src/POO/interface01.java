package POO;

import java.util.ArrayList;

interface Dispositivo {  // Nome no singular
    void ligar();
    void desligar();
}

class Celular implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("O celular está ligando. 📱");
    }

    @Override
    public void desligar() {
        System.out.println("O celular está desligando. 📱");
    }
}

class Computador implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("O computador está ligando. 💻");
    }

    @Override
    public void desligar() {
        System.out.println("O computador está desligando. 💻");
    }
}

class Microfone implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("O microfone está ligando. 🎤");
    }

    @Override
    public void desligar() {
        System.out.println("O microfone está desligando. 🎤");
    }
}

public class interface01 {
    public static void main(String[] args) {
        ArrayList<Dispositivo> dispositivos = new ArrayList<>();

        dispositivos.add(new Celular());
        dispositivos.add(new Computador());
        dispositivos.add(new Microfone());

        for (Dispositivo dispositivo : dispositivos) {
            dispositivo.ligar();
            dispositivo.desligar();
            System.out.println("------"); // Separação para melhor visualização
        }
    }
}
