package models;

public class Produs {

     private String numeProdus;
     private double pret;
     private int  nrRecenzii;

     public Produs(String numeProdus, double pret, int nrRecenzii ) {
         this.numeProdus = numeProdus;
         this.pret = pret;
         this.nrRecenzii = nrRecenzii;
     }

    public String getNumeProdus() {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getNrRecenzii() {
        return nrRecenzii;
    }

    public void setNrRecenzie(int nrRecenzii) {
        this.nrRecenzii = nrRecenzii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" Produs { ");
        sb.append(" numeProdus = '").append(numeProdus).append('\'');
        sb.append(", pret = ").append(pret).append(" RON");
        sb.append(", nrRecenzii = ").append(nrRecenzii);
        sb.append(" } ");
        return sb.toString();
    }
}
