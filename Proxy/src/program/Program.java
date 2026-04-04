package program;

import app.Comanda;
import app.ComandaProxy;

public class Program {
    static void main(String[] args) {

        Comanda comanda = new Comanda(1899, 1001);
        Comanda comanda2 = new Comanda(21000, 9999);
        ComandaProxy comandaProxy = new ComandaProxy(comanda);
        ComandaProxy comandaProxy2 = new ComandaProxy(comanda2);

        comandaProxy.anulareComanda();
        comandaProxy2.anulareComanda();

    }
}
