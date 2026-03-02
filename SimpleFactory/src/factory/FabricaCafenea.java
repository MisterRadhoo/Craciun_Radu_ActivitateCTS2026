package factory;

import aplicatie.cafenea.Cafenea;
import aplicatie.cafenea.CafeneaFranciza;
import aplicatie.cafenea.CafeneaPremium;
import aplicatie.cafenea.CafeneaToGo;

public class FabricaCafenea {

    // lazy init
    private static FabricaCafenea instanta = null;

    // singura instanta statica a clasei FabricaCafenea
    public static synchronized FabricaCafenea getInstanta() {
        if(instanta == null) {
            instanta = new FabricaCafenea();
        }
        return instanta;
    }

    // constructor privat
    private FabricaCafenea() {

    }

    public Cafenea getCafenea(TipCafenea tipCafenea, String franciza, String denumire, String locatie, int numarClienti ) {
      return switch(tipCafenea) {
          case TipCafenea.ToGo ->  new CafeneaToGo(denumire, locatie, numarClienti);
          case TipCafenea.Premium -> new CafeneaPremium(denumire, locatie, numarClienti);
          case TipCafenea.Franciza -> new CafeneaFranciza(franciza, denumire, locatie, numarClienti);
          default -> null;
      };
    }
}
