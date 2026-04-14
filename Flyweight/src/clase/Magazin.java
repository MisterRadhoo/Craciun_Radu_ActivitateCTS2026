package clase;

// obiect Flyweight
public class Magazin implements IMagazin {

    private int codComanda;
    private String numeProdus;
    private int numarProduse;
    private String adresa;
    private String metodaPlata;

    public Magazin (int codComanda, String numeProdus, int numarProduse, String adresa, String metodaPlata ) {
        super();
        this.codComanda = codComanda;
        this.numeProdus = numeProdus;
        this.numarProduse = numarProduse;
        this.adresa = adresa;
        this.metodaPlata = metodaPlata;
    }

    @Override
    public void detaliiComanda(Comanda comanda) {
         System.out.println(this.toString() + " " + comanda.toString());
    }

    @Override
    public String toString() {
        return "Magazin [codComanda= " + codComanda + ", numeProdus= " + numeProdus + ", numarProduse= " + numarProduse +
                ", adresa=" + adresa + ", metodaPlata= " + metodaPlata + "]";
    }

}
