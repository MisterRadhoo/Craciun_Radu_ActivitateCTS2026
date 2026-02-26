package eager_init_app;

import lazy_init_app.Magazin;

public class Magazin2 {
     private String numeMagazin;
     private String adresa;
     private double capital;
     private int numarAngajati;

     //eager initialization
     private static Magazin2 instanta = new Magazin2();

     private Magazin2() {
         this.numeMagazin = "Bambus Tech Junky";
         this.adresa = "calea victorier nr.44A";
         this.capital = 1000.0;
         this.numarAngajati = 4;
     }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public String getAdresa() {
        return adresa;
    }

    public double getCapital() {
        return capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public static synchronized Magazin2 getInstanta() {
        return instanta;
    }

    public void setNumeMagazin(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Magazin2 {");
        sb.append("numeMagazin= '").append(numeMagazin).append('\'');
        sb.append(", adresa= '").append(adresa).append('\'');
        sb.append(", capital= ").append(capital).append(" $ ");
        sb.append(", numarAngajati= ").append(numarAngajati);
        sb.append(" } ");
        return sb.toString();
    }
}
