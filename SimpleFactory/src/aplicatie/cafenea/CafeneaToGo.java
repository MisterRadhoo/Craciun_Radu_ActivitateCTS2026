package aplicatie.cafenea;

public class CafeneaToGo extends Cafenea {

    public CafeneaToGo(String denumire, String locatie, int numarClienti) {
        super(denumire,locatie, numarClienti);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CafeneaToGo{");
        sb.append("denumire= ").append(super.denumire).append(" ");
        sb.append(", locatie= ").append(super.locatie).append(" ");
        sb.append(", numarClienti= ").append(super.numarClienti);
        sb.append(" } ");
        return sb.toString();
    }
}
