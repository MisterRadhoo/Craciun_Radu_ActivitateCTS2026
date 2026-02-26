package lazy_init_app;

public class Magazin3 {
     private String numeMagazin;
     private String adresa;
     private double capital;
     private int numarAngajati;

     private static Magazin3 instanta = null;

     private Magazin3(String numeMagazin, String adresa, double capital,int numarAngajati) {
         this.numeMagazin = numeMagazin;
         this.adresa = adresa;
         this.capital = capital;
         this.numarAngajati = numarAngajati;
     }

     public  static Magazin3 getInstanta(String numeMagazin, String adresa, double capital, int numarAngajati) {
         if(instanta == null) {
            instanta = new Magazin3(numeMagazin, adresa, capital, numarAngajati);
         }
         return instanta;
     }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public void setNumeMagazin(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Magazin3 {");
        sb.append("numeMagazin='").append(numeMagazin).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", capital=").append(capital).append(" $ ");
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append(" }");
        return sb.toString();
    }
}
