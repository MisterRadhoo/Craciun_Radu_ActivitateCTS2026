package aplicatie.cafenea;

public class CafeneaPremium  extends Cafenea {

    public CafeneaPremium(String denumire, String locatie, int numarClienti) {
        super(denumire, locatie, numarClienti);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CafeneaPremium{");
        sb.append("locatie= ").append(super.locatie).append(" ");
        sb.append(", denumire= ").append(super.denumire).append(" ");
        sb.append(", numarClienti= ").append(super.numarClienti);
        sb.append(" } ");
        return sb.toString();
    }
}
