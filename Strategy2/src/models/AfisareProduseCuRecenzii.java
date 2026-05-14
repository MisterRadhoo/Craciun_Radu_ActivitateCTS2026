package models;

import java.util.List;

public class AfisareProduseCuRecenzii  implements IProdus {

    @Override
    public void vizualizareProduse(String numeMagazin, List<Produs> produse ) {

        produse.stream().filter(produs -> produs.getNrRecenzii() > 0).forEach((produs) ->
                System.out.println(numeMagazin + " afiseaza produse " + produs.getNumeProdus() + " cu cel putin o recenzie " + produs.getNrRecenzii()));
    }
}
