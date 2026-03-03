package aplicatie.componenta.program;

import aplicatie.componenta.clasa.abstracta.Componenta;
import aplicatie.componenta.clase.RAM;
import aplicatie.componenta.factory.FactoryAbstracta;
import aplicatie.componenta.factory.PlacaDeBazaFactory;
import aplicatie.componenta.factory.RAMFactory;
import aplicatie.componenta.factory.RouterFactory;

public class Program {

    private static void printareComponenta(FactoryAbstracta fabrica, String producator, String model, double nrVolti, double curentAdmis) {
        Componenta componenta = fabrica.creareComponenta(producator, model, nrVolti, curentAdmis);
        componenta.calculeazaPutereCurentElectric();
        System.out.println(componenta.toString());

    }

     static void main(String[] args) {
        printareComponenta(new RAMFactory(), "Kingston", "SDRAM-45T", 1.35, 1.2);
         printareComponenta(new PlacaDeBazaFactory(), "GigaByte", "Test-44C", 3.35, 3.02);
         printareComponenta(new RouterFactory(), "ASUS", "AsusFactory-45GR", 2.57, 2.05);

         Componenta RAM = new RAM("Corsair", "COS_45", 1.35, 1.02);
         RAM.calculeazaPutereCurentElectric();
         System.out.println(RAM.toString());
         System.out.println("Putere electrica: " + RAM.calculeazaPutereCurentElectric() + " W");
    }
}
