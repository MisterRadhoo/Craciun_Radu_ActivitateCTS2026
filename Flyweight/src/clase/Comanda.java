package clase;

public class Comanda {
    private String numeClient;
    private int numarComanda;

    public Comanda(String numeClient, int numarComanda) {
        this.numeClient = numeClient;
        this.numarComanda = numarComanda;
    }

    @Override
    public String toString() {
        return "Comanda [numeClient= " + numeClient + ", numarComanda= " + numarComanda+ "]";
    }

}
