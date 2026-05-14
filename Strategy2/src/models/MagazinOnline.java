package models;

import java.util.List;

public class MagazinOnline {

     private String numeMagazin;
     private IProdus strategiaDeAfisare;
     private List <Produs> produse;

     public void vizualizareProduse(List<Produs> produse) {
         strategiaDeAfisare.vizualizareProduse(this.numeMagazin, produse);
     }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public void setNumeMagazin(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public IProdus getStrategiaDeAfisare() {
        return strategiaDeAfisare;
    }

    public void setStrategiaDeAfisare(IProdus strategiaDeAfisare) {
        this.strategiaDeAfisare = strategiaDeAfisare;
    }

    public MagazinOnline(String numeMagazin, IProdus strategiaDeAfisare) {
         this.numeMagazin = numeMagazin;
         this.strategiaDeAfisare = strategiaDeAfisare;
    }

    public MagazinOnline(String numeMagazin) {
         super();
         this.numeMagazin = numeMagazin;
         this.strategiaDeAfisare  = new AfisareProdusePretCrescator();
    }

}
