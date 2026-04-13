package clase;

public class CompanieAeriana {
    private String numeCompanieAeriana;

    public CompanieAeriana(String nume) {
        this.numeCompanieAeriana = nume;
    }

    public Zbor rezervareBiletAvion(String plecare, String destinatie)  {
        Zbor zbor = new Zbor(plecare, destinatie, this);  // this => referinta la obiectul CompanieAeriana
        return zbor;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompanieAeriana {");
        sb.append("numeCompanieAeriana='").append(numeCompanieAeriana).append('\'');
        sb.append(" } ");
        return sb.toString();
    }
}
