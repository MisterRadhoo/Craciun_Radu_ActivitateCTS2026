package aplicatie.cafenea;

public class CafeneaFranciza extends Cafenea {
     private String franciza;

     public CafeneaFranciza(String franciza, String denumire, String locatie, int numarClienti) {
         super(denumire, locatie, numarClienti);
         this.franciza = franciza;
     }

     public String getFranciza() {
         return this.franciza;
     }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CafeneaFranciza{");
        sb.append("franciza= ").append(franciza).append(" ");
        sb.append(", denumire= ").append(super.denumire).append(" ");
        sb.append(", locatie= ").append(super.locatie).append(" ");
        sb.append(", numarClienti= ").append(super.numarClienti);
        sb.append(" }");
        return sb.toString();
    }
}
