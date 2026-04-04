package app;

public class Comanda implements IComanda {
    private double totalComanda;
    private int codComanda;

    public Comanda(double totalComanda, int codComanda) {
        super();
        this.totalComanda = totalComanda;
        this.codComanda = codComanda;
    }

    public double getTotalComanda() {
        return this.totalComanda;
    }

    public int getCodComanda() {
        return this.codComanda;
    }
    @Override
    public void anulareComanda() {
        System.out.println("Comanda cu codul: " + codComanda + " in valoare de: " + totalComanda + " RON" +  " a fost anulata!");
    }
}
