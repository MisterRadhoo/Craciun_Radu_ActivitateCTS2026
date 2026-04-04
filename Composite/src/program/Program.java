package program;

import app.Colectie;
import app.INod;
import app.Masina;

public class Program {
    static void main(String[] args) {

        // colectie1
        INod colectie1 = new Colectie ("deluxe RO");

        // colectie2
        INod colectie2 = new Colectie("limited RO");

        // masini
        INod masina1 = new Masina("Dacia", "1310", 44);
        INod masina2 = new Masina("Super lux ARO", "ARO", 78);
        INod masina3 = new Masina("Dacia", "1410", 89);


        // operatii
        colectie1.adaugaNod(masina1);
        colectie1.adaugaNod(masina2);
        colectie1.adaugaNod(masina3);
        colectie1.stergeNod(masina2);

         colectie1.printeaza();
         masina1.printeaza();

         System.out.println("Total cai putere colectia 1: " + colectie1.getCaiPutere());
         System.out.println("Producator colectia 1: " + colectie1.getProducator());
         System.out.println("Index 1 al colectiei 1: " + colectie1.getNod(1));

    }
}
