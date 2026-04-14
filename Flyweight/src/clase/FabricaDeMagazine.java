package clase;

import java.util.HashMap;

public class FabricaDeMagazine {

    private HashMap<Integer, Magazin> listaComenzi;

    public FabricaDeMagazine() {
        listaComenzi = new HashMap<Integer, Magazin>();
    }

    public IMagazin getMagazin(int codComanda) {
        if(listaComenzi.containsKey(codComanda)) {
            return listaComenzi.get(codComanda);
        } else {
            IMagazin magazin = new Magazin(codComanda, "jacheta", 1, "intrarea Principala nr 23", "cash la livrare");
            listaComenzi.put(codComanda, (Magazin) magazin);
            return magazin;

        }
    }
}
