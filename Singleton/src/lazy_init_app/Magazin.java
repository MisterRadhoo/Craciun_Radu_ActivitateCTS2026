package lazy_init_app;

public class Magazin {

    private String numeMagazin;
    private String adresa;
    private double capital;
    private int numarAngajati;

    // singura instanta din clasa, lazy initialization
    private static Magazin instanta = null;

    // constructor privat
    private Magazin() {
        this.numeMagazin = "Tech Business";
        this.adresa = "Str. Frunte Lata nr.44";
        this.capital = 100000.00;
        this.numarAngajati = 7;
    }

    // un singur thread pe executie, lock pe class Magazin
    public static synchronized Magazin getInstanta() {
        if(instanta == null) {
           instanta = new Magazin();
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" Magazin {");
        sb.append("numeMagazin='").append(numeMagazin).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", capital=").append(capital).append(" $ ");
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append(" }");
        return sb.toString();
    }
}
