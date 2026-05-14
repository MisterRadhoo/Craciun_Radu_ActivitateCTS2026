package app;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class Program {

    static void main(String[] args) {

        // Produse
        Produs produs1 = new Produs("Tricou", 99.77, 0);
        Produs produs2 =  new Produs("Hanorac", 80.99, 0);
        Produs produs3 = new Produs("Jacheta", 1000.88, 1);
        Produs produs4 = new Produs("Adidas", 400.77, 15);

        System.out.println(produs1.toString());

        List<Produs> produse = new ArrayList<>();
        produse.add(produs1);
        produse.add(produs2);
        produse.add(produs3);
        produse.add(produs4);


        // Magazin
        MagazinOnline magazin = new MagazinOnline("Online Shop");

        // Strategii aplicate;
        magazin.setStrategiaDeAfisare( new AfisareProduseCuRecenzii());
        magazin.vizualizareProduse(produse);

        System.out.println("\nProduse cu pret descrescator\n");
        magazin.setStrategiaDeAfisare(new AfisareProdusPretDescrescator());
        magazin.vizualizareProduse(produse);

        System.out.println("\nProduse cu pret crescator\n");
        magazin.setStrategiaDeAfisare(new AfisareProdusePretCrescator());
        magazin.vizualizareProduse(produse);

    }
}
