package program;

import aplicatie.cafenea.Cafenea;
import factory.FabricaCafenea;
import factory.TipCafenea;

public class Program {

    public static void main(String[] args) {
        FabricaCafenea fabricaCafenea = FabricaCafenea.getInstanta();

        Cafenea cafeneaPremium = fabricaCafenea.getCafenea(TipCafenea.Premium, "", "Premium Brasil Coffee", "Uverturi 77A", 25 );
        Cafenea cafeneaToGo = fabricaCafenea.getCafenea(TipCafenea.ToGo, "", "5'toGo", "Posta Puisor 55", 12);
        Cafenea cafeneaFranciza = fabricaCafenea.getCafenea(TipCafenea.Franciza, "China Coffee Spring franchise", "CCS", "calea victoriei 44A", 78);

        System.out.println(cafeneaPremium.toString());
        System.out.println(cafeneaToGo.toString());
        System.out.println(cafeneaFranciza.toString());
    }
}
