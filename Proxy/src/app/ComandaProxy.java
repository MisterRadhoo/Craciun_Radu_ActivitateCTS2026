package app;

public class ComandaProxy  implements  IComanda {

    private Comanda comanda;

    public ComandaProxy(Comanda comanda) {
        this.comanda = comanda;
    }



    @Override
    public void anulareComanda() {
        if(comanda.getCodComanda() == 1001) {
            comanda.anulareComanda();
        }
        else {
            System.out.println("Anularea nu este permisa!");
        }

    }

}
