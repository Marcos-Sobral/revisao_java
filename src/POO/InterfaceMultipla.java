package POO;

interface DispositivoEletronico {
    void ligar();
    void desligar();
}

interface Conectividade {
    void conectarWifi();
    void desconectarWifi();
}

class Notebook implements DispositivoEletronico, Conectividade {
    @Override
    public void ligar() {
        System.out.println("Notebook ligado. 💻");
    }

    @Override
    public void desligar() {
        System.out.println("Notebook desligado. 💻");
    }

    @Override
    public void conectarWifi() {
        System.out.println("Notebook conectado ao Wi-Fi. 📶");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Notebook desconectado do Wi-Fi. 📶");
    }
}

public class InterfaceMultipla {
    public static void main(String[] args) {
        Notebook meuNotebook = new Notebook();

        meuNotebook.ligar();
        meuNotebook.conectarWifi();
        meuNotebook.desconectarWifi();
        meuNotebook.desligar();
    }
}
