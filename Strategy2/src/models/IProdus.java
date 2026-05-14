package models;

import java.util.List;

// strategia de afisare a produsului
public interface IProdus {

    void vizualizareProduse(String numeMagazin, List<Produs> produse);

}
