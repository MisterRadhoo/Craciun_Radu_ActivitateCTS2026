package models;

import java.util.List;

// Concrete Strategy
public class AfisareProdusPretDescrescator  implements  IProdus {

    @Override
    public void vizualizareProduse(String numeMagazin, List<Produs> produse ) {

        produse.stream().sorted((a,b) -> Double.compare(b.getPret(), a.getPret()))
                .forEach((produs) ->
                        System.out.println(
                                numeMagazin + " afiseaza produsele: " + produs.getNumeProdus() + " cu pret descrescator "
                         + produs.getPret() + " lei"));
    }
}
