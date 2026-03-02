package aplicatie.cafenea;


public  abstract class Cafenea {
    protected  String denumire;
    protected  String locatie;
    protected  int numarClienti;

    public Cafenea(String denumire, String locatie, int numarClienti) {
          this.denumire = denumire;
          this.locatie = locatie;
          this.numarClienti = numarClienti;
    }
}
