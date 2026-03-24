package clase;

import clase.IMagazin;

public class Magazin implements IMagazin {

     private String nume;
     private String locatie;
     private int nrClienti;

     public Magazin(String nume, String locatie, int nrClienti ) {
         super();  // apeleaza constructorul fara parametrii din clasa Parinte
         this.nume = nume;
         this.locatie = locatie;
         this.nrClienti = nrClienti;
     }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public int getNrClienti() {
        return nrClienti;
    }

    public void setNrClienti(int nrClienti) {
        this.nrClienti = nrClienti;
    }

    @Override
    public void printeazaMagazin() {
         System.out.println("Magazin cu numele: " + nume + " localizat in: " + locatie + " are un numar de: " + nrClienti + " clienti ");
     }


}
