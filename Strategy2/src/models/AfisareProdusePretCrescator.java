package models;

import java.util.Comparator;
import java.util.List;

// Concrete stragegy
public class AfisareProdusePretCrescator implements  IProdus {

    @Override
    public void vizualizareProduse(String numeMagazin, List<Produs> produse) {
           produse.stream().sorted((a,b) -> Double.compare(a.getPret(), b.getPret()))
                           .forEach((produs) ->
                                   System.out.println(
                                           numeMagazin + " afiseaza produsele: "
                                                   + produs.getNumeProdus() + " cu pret crescator " + produs.getPret()));


    }
}
