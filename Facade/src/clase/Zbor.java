package clase;

public class Zbor {

    private CompanieAeriana companie;  // relatie has-a ( asociere)
    private String orasPlecare;
    private String orasDestinatie;

    public Zbor(String orasPlecare, String orasDestinatie, CompanieAeriana companie) {
         super();
         this.orasPlecare = orasPlecare;
         this.orasDestinatie = orasDestinatie;
         this.companie = companie;
    }


    public CompanieAeriana getCompanie() {
        return companie;
    }

 
    public void setCompanie(CompanieAeriana companie) {
        this.companie = companie;
    }

    public String getOrasPlecare() {
        return orasPlecare;
    }

    public void setOrasPlecare(String orasPlecare) {
        this.orasPlecare = orasPlecare;
    }

    public String getOrasDestinatie() {
        return orasDestinatie;
    }

    public void setOrasDestinatie(String orasDestinatie) {
        this.orasDestinatie = orasDestinatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" Zbor {");
        sb.append("companie =").append(companie);
        sb.append(", orasPlecare ='").append(orasPlecare).append('\'');
        sb.append(", orasDestinatie ='").append(orasDestinatie).append('\'');
        sb.append(" } ");
        return sb.toString();
    }
}
