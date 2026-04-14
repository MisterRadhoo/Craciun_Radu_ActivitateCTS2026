package program;

import clase.Comanda;
import clase.FabricaDeMagazine;
import clase.IMagazin;

public class Program {
    static void main(String[] args) {

        Comanda comanda1 = new Comanda("Ionescu", 1001);
        Comanda comanda2 = new Comanda("Craciun Radu", 1002);
        Comanda comanda3 = new Comanda("Ana Popescu", 1100);

        FabricaDeMagazine fabrica = new FabricaDeMagazine();

        IMagazin magazin = fabrica.getMagazin(1001);
        magazin.detaliiComanda(comanda1);

        fabrica.getMagazin(1002).detaliiComanda(comanda2);
        fabrica.getMagazin(1100).detaliiComanda(comanda3);
    }
}
